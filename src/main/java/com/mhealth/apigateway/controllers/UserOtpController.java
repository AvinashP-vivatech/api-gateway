//package com.mhealth.apigateway.controllers;
//
//
//import com.mhealth.api.gateway.dto.response.UserOtpResponse;
//import com.mhealth.api.gateway.services.OtpService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/otp")
//public class UserOtpController {
//    @Autowired
//    private OtpService otpService;
//
//    @PostMapping("/register")  //using current userId
//    public UserOtpResponse otpRegister(@RequestParam int userId){
//        UserOtpResponse response=otpService.otpRegister(userId);
//        return response;
//    }
//
//    @PostMapping("/verifyOtp")
//    public String verifyOtp(String otp){
//        try{
//            String value= otpService.verifyOtp(otp);
//            return "Otp verified successfully";
//        }catch(Exception e){
//            return e.getMessage();
//        }
//
//
//    }
//}
