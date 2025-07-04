package com.yasin.erp.service.impl;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.dto.EmployeeResDto;
import com.yasin.erp.model.dto.UpdateEmployeeReqDTO;
import com.yasin.erp.model.entity.Employee;
import com.yasin.erp.model.mapper.EmployeeMapper;
import com.yasin.erp.repository.EmployeeRepo;
import com.yasin.erp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {

    private final EmployeeRepo employeeRepo;

    private final EmployeeMapper employeeMapper;


    @Override
    public EmployeeResDto saveEmployee(EmployeeReqDTO req) {
        Employee employee = this.employeeMapper.toEntity(req);
        Employee saveEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDto(saveEmployee);
    }

    @Override
    public List<Employee> getAllEmplyee() {
        return this.employeeRepo.findAll();
    }

    @Override
    public EmployeeResDto updateEmployee(UpdateEmployeeReqDTO dto) {
        Employee entity = this.employeeMapper.toEntity(dto);
        Employee savedEntity = this.employeeRepo.save(entity);
        return this.employeeMapper.toRespDto(savedEntity);
    }


}
