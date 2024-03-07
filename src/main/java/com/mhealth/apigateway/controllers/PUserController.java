//package com.mhealth.apigateway.controllers;
//
//import com.mhealth.api.gateway.dto.request.DPUserRegisterRequest;
//import com.mhealth.api.gateway.dto.response.DPUserRegisterResponse;
//import com.mhealth.api.gateway.services.DPUserServices;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/patient")
//public class UserController {
//
//    @Autowired
//    private DPUserServices DPUserServices;
//
//    @PostMapping("/register")
//    public DPUserRegisterResponse register(@RequestBody @Valid DPUserRegisterRequest DPUserRegisterRequest){
//        try{
//            DPUserRegisterResponse response= DPUserServices.register(DPUserRegisterRequest);
//            return response;
//        }catch(Exception e){
//            return null;
//        }
//    }
//}
