package com.yasin.erp.model.mapper.implementation;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.entity.Employee;
import com.yasin.erp.model.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public Employee toEnity(EmployeeReqDTO dto) {
        return Employee.builder()
                .employeeName(dto.getUsername())
                .employeePassword(dto.getPassword())
                .employeeEmail(dto.getEmail())
                .build();
    }
}
