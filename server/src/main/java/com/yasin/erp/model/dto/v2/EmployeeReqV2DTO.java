package com.yasin.erp.model.dto.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeReqV2DTO {
    private String employeeName;
    private String employeePassword;
    private String employeeEmail;
}
