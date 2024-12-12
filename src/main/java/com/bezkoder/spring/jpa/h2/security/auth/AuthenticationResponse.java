package com.bezkoder.spring.jpa.h2.security.auth;

import com.bezkoder.spring.jpa.h2.security.user.User;
import com.bezkoder.spring.jpa.h2.security.user.UserResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

  @JsonProperty("access_token")
  private String accessToken;
  @JsonProperty("refresh_token")
  private String refreshToken;
  private UserResponseDto user;
}
