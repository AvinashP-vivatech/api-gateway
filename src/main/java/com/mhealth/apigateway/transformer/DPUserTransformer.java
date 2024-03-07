package com.mhealth.apigateway.transformer;
import com.mhealth.apigateway.dto.APIGatewayEnum;
import com.mhealth.apigateway.dto.request.DPUserRegisterRequest;
import com.mhealth.apigateway.entity.PUser;

import java.time.LocalDateTime;

public class DPUserTransformer {
    public static PUser DPUserRegisterRequestToDPUser(DPUserRegisterRequest dpUserRegisterRequest){

        return PUser.builder()
                .firstName(dpUserRegisterRequest.getFirstName())
                .lastName(dpUserRegisterRequest.getLastName())
                .contactNumber(dpUserRegisterRequest.getContactNumber())  //we have to handle promo code ,
                // since promo code field is not present in DpUser
                //.countryCode()
                //.stateId()
                //.countryId()
                //.cityId()
                //.agentUserId()

                .type("patient")
                .status(String.valueOf(APIGatewayEnum.Status.SUCCESS))

                //we can use history here for fetching newly generated otp class
//                .otp()
//                .otpCreationTime() -- we will handle in updateRequest
//                .otpCounter()  //it will count how many times user requesting for otp

                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())


                .build();
    }
}
