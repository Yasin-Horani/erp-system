package com.yasin.erp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeReqDTO {
    private String employeeName;
    private String employeePassword;
    private String employeeEmail;
}
