package com.yasin.erp.model.dto.v2;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeReqV2DTO {

    @NotNull(message = "You have to add employer name")
    @Size(min = 3, max = 25, message = "Employee name must be between 3 and 25 characters")
    private String employeeName;

    @NotNull(message = "You must provide a password")
    @Size(min = 10, max = 30, message = "Password must be between 10 and 30 characters")
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=(?:.*[a-z]){3,})(?=(?:.*\\d){3,})(?=.*[@!#$%^&*]).+$",
            message = "Password must contain at least 1 uppercase letter, 3 lowercase letters, 3 digits, and 1 " +
                    "special character (@!#$%^&*)"
    )
    private String employeePassword;

    @Email(message = "Invalid email format")
    @NotNull(message = "Email is required gmail ro hotmail")
    @Pattern(
            regexp = "^[A-Za-z0-9._%+-]+@(gmail\\.com|hotmail\\.com)$",
            message = "Only Gmail or Hotmail addresses are allowed"
    )
    private String employeeEmail;
}
