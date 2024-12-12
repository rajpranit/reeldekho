package com.bezkoder.spring.jpa.h2.security.user;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {

    private String firstname;
    private String lastname;
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

}
