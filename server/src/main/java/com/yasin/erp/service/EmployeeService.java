package com.yasin.erp.service;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.dto.EmployeeResDto;
import com.yasin.erp.model.dto.UpdateEmployeeReqDTO;
import com.yasin.erp.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    // add new employee
    EmployeeResDto saveEmployee(EmployeeReqDTO req);

    // get all employee
    List<Employee> getAllEmplyee();

    //update employee
    EmployeeResDto updateEmployee(UpdateEmployeeReqDTO Id);
}
