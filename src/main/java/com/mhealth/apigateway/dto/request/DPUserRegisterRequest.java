package com.mhealth.apigateway.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.antlr.v4.runtime.misc.NotNull;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class DPUserRegisterRequest {
    @NotNull
    String firstName;

    @NotNull
    String lastName;

    @NotNull
    String contactNumber;

    @NotNull
    String promoCode;
}
