package com.yasin.erp.model.entity;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_password")
    private String employeePassword;
    @Column(name = "employee_email")
    private String employeeEmail;


    public static Employee toEntity(EmployeeReqDTO dto) {
        Employee employee = new Employee();
        employee.setEmployeeName(dto.getUsername());
        employee.setEmployeeEmail(dto.getEmail());
        employee.setEmployeePassword(dto.getPassword());
        return employee;
    }
}
