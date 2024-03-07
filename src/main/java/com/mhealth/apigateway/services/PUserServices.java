package com.mhealth.apigateway.services;

import com.mhealth.apigateway.dto.request.DPUserRegisterRequest;
import com.mhealth.apigateway.dto.response.PUserRegisterResponse;
import com.mhealth.apigateway.entity.PUser;
import com.mhealth.apigateway.repository.PUserRepository;
import com.mhealth.apigateway.transformer.DPUserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PUserServices {

    @Autowired
    private PUserRepository pUserRepository;

    public PUserRegisterResponse register(DPUserRegisterRequest dpUserRegisterRequest) {

        //save into database
        PUser save = pUserRepository.save(DPUserTransformer.DPUserRegisterRequestToDPUser(dpUserRegisterRequest));

        return PUserRegisterResponse.builder()
                .userId(save.getUserId())
                .firstName(save.getFirstName())
                .lastName(save.getLastName())
                .contactNo(save.getContactNumber())
                .build();

    }
}
