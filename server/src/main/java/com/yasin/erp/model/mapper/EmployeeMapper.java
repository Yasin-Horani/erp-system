package com.yasin.erp.model.mapper;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    // from dto to entity
    Employee toEntity(EmployeeReqDTO dto);

    // from entity to response
    EmployeeReqDTO toRespDto(Employee entity);

}
