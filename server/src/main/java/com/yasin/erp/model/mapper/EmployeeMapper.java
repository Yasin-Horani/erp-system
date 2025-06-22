package com.yasin.erp.model.mapper;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.dto.EmployeeResponseDto;
import com.yasin.erp.model.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeMapper {
    Employee toEnity(EmployeeReqDTO dto);

    EmployeeResponseDto toRespDto(Employee entity);
}
