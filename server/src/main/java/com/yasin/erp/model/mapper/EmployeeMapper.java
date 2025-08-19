package com.yasin.erp.model.mapper;

import com.yasin.erp.model.dto.*;
import com.yasin.erp.model.dto.v2.EmployeeReqV2DTO;
import com.yasin.erp.model.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee toEntity(EmployeeReqDTO dto);

    Employee toEntity(EmployeeReqV2DTO dto);

    Employee toEntity(UpdateEmployeeReqDTO dto);

    Employee toEntity(DeleteEmployeeReqDTO dto);

    EmployeeResDTO toRespDto(Employee entity);

    EmployeeDTO toDTO(Employee entity);

    Employee toEntity(EmployeeDTO dto);
}