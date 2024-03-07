//package com.mhealth.apigateway.entity;
//
//import com.mhealth.api.gateway.Enum.OtpFrom;
//import com.mhealth.api.gateway.Enum.OtpStatus;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Table(name = "mh_user_otp")
//@Data
//public class UserOTP {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "user_id", nullable = false) //should be re-direct from login, else null
//    private int userId;
//
//    @Column(name = "otp", length = 250) //should be generated from our end
//    private String otp;
//
//    @Column(name = "expired_at")   //after 3 minutes it will expires after generation
//    private LocalDateTime expiredAt;
//
//    @Column(name = "status") //either active or inactive, it means if otp expires
//    private OtpStatus status;
//
//    @Column(name = "is_from")  //either from login or registration
//    private OtpFrom isFrom;
//
//    @Column(name = "type", columnDefinition = "varchar(20)")
//    private String type;
//}
