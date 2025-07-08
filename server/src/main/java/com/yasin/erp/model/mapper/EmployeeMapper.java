package com.yasin.erp.model.mapper;

import com.yasin.erp.model.dto.DeleteEmployeeReqDto;
import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.dto.EmployeeResDto;
import com.yasin.erp.model.dto.UpdateEmployeeReqDTO;
import com.yasin.erp.model.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee toEntity(EmployeeReqDTO dto);

    Employee toEntity(UpdateEmployeeReqDTO dto);

    Employee toEntity(DeleteEmployeeReqDto dto);

    EmployeeResDto toRespDto(Employee entity);
}