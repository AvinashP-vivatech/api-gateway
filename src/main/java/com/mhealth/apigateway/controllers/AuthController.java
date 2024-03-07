package com.mhealth.apigateway.controllers;

import com.mhealth.apigateway.dto.APIGatewayEnum;
import com.mhealth.apigateway.config.JwtTokenUtil;
import com.mhealth.apigateway.dto.request.JwtRequest;
import com.mhealth.apigateway.dto.response.BaseResponseDto;
import com.mhealth.apigateway.dto.response.JwtResponse;
import com.mhealth.apigateway.entity.PUser;
import com.mhealth.apigateway.repository.PUserRepository;
import com.mhealth.apigateway.services.JwtUserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import static com.mhealth.apigateway.dto.APIGatewayEnum.Status.SUCCESS;
import static com.mhealth.apigateway.dto.APIGatewayEnum.UserType.Patient;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class AuthController {

    @Autowired
    private JwtUserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PUserRepository pUserRepository;  //this is mu user class


    @Autowired
    private JwtTokenUtil helper;

    private Logger logger = LoggerFactory.getLogger(AuthController.class);


    @RequestMapping(value = "/verify-otp", method = RequestMethod.POST)
    public BaseResponseDto login(@RequestBody JwtRequest authenticationRequest) throws Exception {

        authenticate(authenticationRequest.getOtp(), authenticationRequest.getContactNumber());

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getContactNumber());

        final String token = helper.generateToken(userDetails);  //getUserName

        PUser dpUser = pUserRepository.findByContactNumber(authenticationRequest.getContactNumber());


        if( authenticationRequest.getIsRegistered() == "Yes" ) {

            JwtResponse jwtResponse = JwtResponse.builder()
                    .isRegistered("YES")
                    .userId(dpUser.getUserId())
                    .authKey(token)
                    .userType(Patient)
                    .userPhoto(null)
                    .firstName(dpUser.getFirstName())
                    .lastName(dpUser.getLastName())
                    .fullName(dpUser.getFirstName() + " " + dpUser.getLastName())
                    .email(dpUser.getEmail())
                    .contactNumber(dpUser.getContactNumber())
                    .build();

            return   BaseResponseDto.builder()
                    .status(SUCCESS)
                    .statusCode("200")
                    .message("User logged in successfully")
                    .data(jwtResponse)
                    .build();
        }
        return BaseResponseDto.builder()
                    .status(APIGatewayEnum.Status.FAILED)
                    .statusCode("404")
                    .message("Error")
                    .data(null)
                    .build();
        }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }

    @ExceptionHandler(BadCredentialsException.class)
    public String exceptionHandler() {
        return "Credentials Invalid !!";
    }


    }

