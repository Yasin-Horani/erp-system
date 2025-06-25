package com.yasin.erp.model.mapper;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.dto.EmployeeResponseDto;
import com.yasin.erp.model.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mapping(source = "username", target = "employeeName")
    @Mapping(source = "password", target = "employeePassword")
    @Mapping(source = "email", target = "employeeEmail")
    Employee toEntity(EmployeeReqDTO dto);

    @Mapping(source = "employeeName", target = "username")
    @Mapping(source = "employeeEmail", target = "email")
    EmployeeResponseDto toRespDto(Employee entity);
}