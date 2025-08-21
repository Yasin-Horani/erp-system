package com.yasin.erp.service.impl.v2;


import com.yasin.erp.model.dto.EmployeeResDTO;
import com.yasin.erp.model.dto.v2.EmployeeReqV2DTO;
import com.yasin.erp.model.entity.Employee;
import com.yasin.erp.model.mapper.EmployeeMapper;
import com.yasin.erp.repository.EmployeeRepo;
import com.yasin.erp.service.v2.EmployeeServiceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpV2 implements EmployeeServiceV2 {

    private final EmployeeRepo employeeRepo;

    private final EmployeeMapper employeeMapper;


    @Override
    public EmployeeResDTO saveEmployee(EmployeeReqV2DTO req) {
        Employee employee = this.employeeMapper.toEntity(req);
        Employee saveEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDto(saveEmployee);
    }

    @Override
    public List<Employee> getAllEmplyee() {
        return this.employeeRepo.findAll();
    }
}
