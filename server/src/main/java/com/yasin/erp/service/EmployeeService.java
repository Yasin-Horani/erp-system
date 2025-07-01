package com.yasin.erp.service;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.dto.EmployeeResDto;
import com.yasin.erp.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeResDto addNewEmpolyee(EmployeeReqDTO req);

    List<Employee> getAllEmplyee();
}
