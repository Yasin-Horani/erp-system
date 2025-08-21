package com.yasin.erp.service.v2;


import com.yasin.erp.model.dto.EmployeeResDTO;
import com.yasin.erp.model.dto.v2.EmployeeReqV2DTO;
import com.yasin.erp.model.entity.Employee;

import java.util.List;


public interface EmployeeServiceV2 {
    // add new employee
    EmployeeResDTO saveEmployee(EmployeeReqV2DTO req);

    // get all employee
    List<Employee> getAllEmplyee();

}
