package com.mhealth.apigateway.dto.response;

import com.mhealth.apigateway.dto.APIGatewayEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponseDto {

   private APIGatewayEnum.Status status;

   private String statusCode;

   private Object data;

   private String error;

   private String message;

}
