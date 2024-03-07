package com.mhealth.apigateway.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "z_mh_users")
public class PUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "professional_identification_number") //for doctor
    private String professionalIdentificationNumber;

    @Column(name = "first_name", length = 50, nullable = false) //both
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false) //both
    private String lastName;

    @Column(name = "email") //this is required field for type doctor
    private String email;

    @Column(name = "profile_picture", length = 100) //this is required field for type doctor
    private String profilePicture;

    @Column(name = "contact_number", length = 20, nullable = false) //for both patient and doctor
    private String contactNumber;

    @Column(name = "password") //for both patient and doctor
    private String password;

    @Column(name = "country_id") //for both patient and doctor
    private int countryId;

    @Column(name = "country_code", length = 6) //for both patient and doctor
    private String countryCode;

    @Column(name = "state_id") //for both patient and doctor
    private int stateId;

    @Column(name = "city_id") //for both patient and doctor
    private int cityId;

    @Column(name = "hospital_address", length = 255)
    private String hospitalAddress;

    @Column(name = "residence_address", length = 255) //for both patient and doctor
    private String residenceAddress;

    @Column(name = "clinic_name", length = 50)
    private String clinicName;

//    @Column(name = "experience", precision = 15, scale = 2)
    @Column(name = "experience")
    private double experience;

    @Column(name = "specialization_id")
    private int specializationId;

   // @Column(name = "type", length = 50, nullable = false, columnDefinition = "varchar(50) default 'doctor'")
    @Column(name = "type", length = 50, nullable = false)
    private String type;  ////for both patient and doctor

    @Column(name = "add_additional_info", length = 500)
    private String additionalInfo;

    @Column(name = "about_me")
    private String aboutMe;

    @Column(name = "extra_activities")
    private String extraActivities;

    @Column(name = "language_fluency")
    private String languageFluency; //make it enum type

    @Column(name = "status")
    private String status; //active or inactive

    @Column(name = "total_money")
    private double totalMoney;

    @Column(name = "slot_type_id")
    private String slotTypeId; //make it enum/fetch from another source

    @Column(name = "otp")
    private int otp; //int type only contains 6 digit otp generated from userOtp generation

    @Column(name = "otp_time")
    private LocalDateTime otpCreationTime;

    @Column(name = "otp_counter")
    private int otpCounter; // need to ask, i think how many times this user ask for otp

    @Column(name = "is_verified")
    private String isVerified; //make it boolean yes or no or we can make it enum type

    @Column(name = "agent_user_id")
    private int agentUserId; // need to ask what is this

    @Column(name = "created_at")
    private  LocalDateTime createdAt; // on which time it was created, this is for the first time

    @Column(name = "updated_at")
    private LocalDateTime updatedAt; //at which time it was updated

}

