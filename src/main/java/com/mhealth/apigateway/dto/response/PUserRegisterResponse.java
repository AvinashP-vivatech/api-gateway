package com.mhealth.apigateway.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class PUserRegisterResponse {
    int userId;
    String firstName;
    String lastName;
    String contactNo;

}
