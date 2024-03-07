//package com.mhealth.apigateway.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.Date;
//
//@Data
//@Entity
//@Table(name = "mh_users")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_id")
//    private int userId;
//
//    @Column(name = "professional_identification_number")
//    private String professionalIdentificationNumber;
//
//    @Column(name = "first_name")
//    private String firstName;
//
//    @Column(name = "last_name")
//    private String lastName;
//
//    @Column(name = "email")
//    private String email;
//
////    @Column(name = "is_email_verified")
////    @Enumerated(EnumType.STRING)
////    private YesNoEnum isEmailVerified;
//
//    @Column(name = "dob")
//    private Date dob;
//
//    @Column(name = "profile_picture")
//    private String profilePicture;
//
//    @Column(name = "doctor_id_document")
//    private String doctorIdDocument;
//
//    @Column(name = "doctor_id_name")
//    private String doctorIdName;
//
//    @Column(name = "contact_number", nullable = false)
//    private String contactNumber;
//
//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "country_id")
//    private Integer countryId;
//
//    @Column(name = "country_code")
//    private String countryCode;
//
//    @Column(name = "state_id")
//    private Integer stateId;
//
//    @Column(name = "city_id")
//    private Integer cityId;
//
//    @Column(name = "hospital_id", nullable = false)
//    private int hospitalId;
//
//    @Column(name = "hospital_address")
//    private String hospitalAddress;
//
//    @Column(name = "residence_address")
//    private String residenceAddress;
//
//    @Column(name = "clinic_name")
//    private String clinicName;
//
//    @Column(name = "experience")
//    private Float experience;
//
//    @Column(name = "specialization_id")
//    private Integer specializationId;
//
//    @Column(name = "doctor_classification")
//    private String doctorClassification;
//
//    @Column(name = "type", nullable = false)
//    private String type;
//
//    @Column(name = "add_additional_info")
//    private String additionalInfo;
//
//    @Column(name = "about_me", columnDefinition = "TEXT")
//    private String aboutMe;
//
//    @Column(name = "extra_activities")
//    private String extraActivities;
//
//    @Column(name = "language_fluency")
//    private String languageFluency;
//
////    @Column(name = "status", nullable = false)
////    @Enumerated(EnumType.STRING)
////    private StatusEnum status;
//
//    @Column(name = "total_money", columnDefinition = "FLOAT(10,2) DEFAULT 0.00")
//    private Float totalMoney;
//
//    @Column(name = "slot_type_id", nullable = false, columnDefinition = "INT DEFAULT 2")
//    private Integer slotTypeId;
//
//    @Column(name = "otp")
//    private Integer otp;
//
//    @Column(name = "otp_time")
//    private Date otpTime;
//
//    @Column(name = "otp_counter", nullable = false)
//    private Integer otpCounter;
//
//    @Column(name = "attempt_counter", nullable = false)
//    private Integer attemptCounter;
//
//    @Column(name = "is_suspended", nullable = false)
//    private Integer isSuspended;
//
////    @Column(name = "has_app", nullable = false)
////    @Enumerated(EnumType.STRING)
////    private YesNoEnum hasApp;
////
////    @Column(name = "is_verified", nullable = false)
////    @Enumerated(EnumType.STRING)
////    private YesNoEnum isVerified;
//
//    @Column(name = "is_hpcz_verified", nullable = false, length = 10)
//    private String isHpczVerified;
//
//    @Column(name = "is_hospital_verified", nullable = false, length = 10)
//    private String isHospitalVerified;
//
//    @Column(name = "hpcz_approver_status", nullable = false, columnDefinition = "ENUM('pandding','approve','reject') DEFAULT 'pandding'")
//    private String hpczApproverStatus;
//
//    @Column(name = "hospital_approver_status", nullable = false, columnDefinition = "ENUM('pandding','approve','reject') DEFAULT 'pandding'")
//    private String hospitalApproverStatus;
//
//    @Column(name = "approved_by", nullable = false)
//    private Integer approvedBy;
//
//    @Column(name = "agent_user_id")
//    private Integer agentUserId;
//
//    @Column(name = "administrator_name")
//    private String administratorName;
//
//    @Column(name = "administrator_mobile_number")
//    private String administratorMobileNumber;
//
//    @Column(name = "session_id")
//    private String sessionId;
//
//    @Column(name = "comment", columnDefinition = "TEXT")
//    private String comment;
//
//    @Column(name = "usr_reference_number", length = 15)
//    private String userReferenceNumber;
//
//    @Column(name = "gender", columnDefinition = "ENUM('Male','Female','') DEFAULT NULL")
//    private String gender;
//
//    @Column(name = "has_doctor_video")
//    private String hasDoctorVideo;
//
//    @Column(name = "notification_language")
//    private String notificationLanguage;
//
//    @Column(name = "sort")
//    private Integer sort;
//
//    @Column(name = "wallet_id")
//    private Long walletId;
//
//    @Column(name = "created_by")
//    private Integer createdBy;
//
//    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//    private Date createdAt;
//
//    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP")
//    private Date updatedAt;
//
//    @Column(name = "university_name")
//    private String universityName;
//
//    @Column(name = "passing_year")
//    private Integer passingYear;
//
//    // Constructors, getters, and setters
//
//}
//
