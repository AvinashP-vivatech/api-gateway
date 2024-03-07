package com.mhealth.apigateway.dto.response;

import com.mhealth.apigateway.dto.APIGatewayEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse {
    private String isRegistered; //boolean type 'YES' or 'NO'
    private int userId;
    private String authKey;
    private APIGatewayEnum.UserType userType; //either doctor or patient
    private String userPhoto; //null
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String contactNumber;

    private String verifyToken;
    //signling_server, verify_token, turn_username, turn_password, turn_server, data_bundle_offer, has_app, data_bundle_offer_message


//

}
