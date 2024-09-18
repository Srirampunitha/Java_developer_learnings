package com.Sriram.Jwt_Token_Authentication.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
      private String firstname;
      private String lastname;
      private String email;
      private String password;
 
      
}
