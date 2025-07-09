package com.yasin.erp.service;

import com.yasin.erp.model.dto.*;
import com.yasin.erp.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    // add new employee
    EmployeeResDto saveEmployee(EmployeeReqDTO req);

    // get all employee
    List<Employee> getAllEmplyee();

    //update employee
    EmployeeResDto updateEmployee(UpdateEmployeeReqDTO Id);

    //delete employee
    void deleteEmployee(Long Id);

    // get employee by id
    EmployeeDTO getEmployeeById(Long Id);
}
