package com.yasin.erp.model.dto.v2;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeReqV2DTO {

    @NotNull
    private String employeeName;
    @NotNull
    private String employeePassword;
    @Email
    @NotNull
    private String employeeEmail;
}
