package com.yasin.erp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeReqDTO {
    private Long employeeId;
    private String employeeName;
    private String employeePassword;
    private String employeeEmail;
}
