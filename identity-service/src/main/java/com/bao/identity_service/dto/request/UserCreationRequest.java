package com.bao.identity_service.dto.request;

import com.bao.identity_service.exception.ErrorCode;
import com.bao.identity_service.validator.DobConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE
)
public class UserCreationRequest {
    @NotBlank(message = "Username is not null")
    @Size(min = 3 , message = "USERNAME_INVALID")
    String username;

    @NotBlank(message = "Password is not null")
    @Size(min = 8 , message = "PASSWORD_INVALID")
    String password;
    String firstName;
    String lastName;

    @DobConstraint(min = 16, message = "INVALID_DOB")
    LocalDate dob;
}
