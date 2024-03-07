package com.mhealth.apigateway.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserOtpResponse {

    int otp;
    String isFrom;
    LocalDateTime currentTime;
    LocalDateTime expiryTime;
}
