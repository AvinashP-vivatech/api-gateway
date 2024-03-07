//package com.mhealth.apigateway.services;
//
//import com.mhealth.api.gateway.Enum.OtpFrom;
//import com.mhealth.api.gateway.Enum.OtpStatus;
//import com.mhealth.api.gateway.dto.response.UserOtpResponse;
//import com.mhealth.api.gateway.entity.UserOTP;
//import com.mhealth.api.gateway.repository.DPUserRepository;
//import com.mhealth.api.gateway.repository.OtpRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.Random;
//
//@Service
//public class OtpService {
//
//    @Autowired
//    private OtpRepository otpRepository;
//
//    @Autowired
//    private DPUserRepository dpUserRepository;
//
//    public UserOtpResponse otpRegister(int userId) {
//        //check weather id exists or not
//        if(dpUserRepository.findById(userId) == null) return null;
//
//        Random random = new Random();
//        int otp= 100000 + random.nextInt(900000); //this otp will send to user mobile number
//        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime expires= now.plusMinutes(3);
//
//        UserOTP userOTP=new UserOTP();
//
//        userOTP.setUserId(userId);
//        userOTP.setOtp(String.valueOf(otp));
//        userOTP.setStatus(OtpStatus.ACTIVE);
//        userOTP.setExpiredAt(expires);
//        userOTP.setIsFrom(OtpFrom.Registration);
//
//
//        otpRepository.save(userOTP); //save
//
//        return UserOtpResponse.builder()
//                .otp(otp)
//                .isFrom(OtpFrom.Registration)
//                .currentTime(LocalDateTime.now())
//                .expiryTime(expires)
//                .build();
//    }
//
//    public String verifyOtp(String otp) {
//
//        return otpRepository.findByOtp(otp);
//    }
//}
