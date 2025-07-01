package com.yasin.erp.service.impl;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.dto.EmployeeResponseDto;
import com.yasin.erp.model.entity.Employee;
import com.yasin.erp.model.mapper.EmployeeMapper;
import com.yasin.erp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private EmployeeMapper employeeMapper;

    public EmployeeResponseDto addNewEmpolyee(@RequestBody EmployeeReqDTO req){
        Employee employee = this.employeeMapper.toEntity(req);
        Employee saveEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDto(saveEmployee);
    }
}
