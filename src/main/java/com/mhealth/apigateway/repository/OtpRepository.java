//package com.mhealth.apigateway.repository;
//
//import com.mhealth.api.gateway.entity.UserOTP;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface OtpRepository extends JpaRepository<UserOTP, Integer> {
//    @Query(value = "SELECT otp from mh_user_otp where otp=:otp", nativeQuery = true)
//    String findByOtp(String otp);
//
//
//}
