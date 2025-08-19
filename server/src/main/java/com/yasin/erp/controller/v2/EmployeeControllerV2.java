package com.yasin.erp.controller.v2;



import com.yasin.erp.model.dto.EmployeeResDTO;
import com.yasin.erp.model.dto.v2.EmployeeReqV2DTO;
import com.yasin.erp.service.v2.EmployeeServiceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/employees/v2")
public class EmployeeControllerV2 {

    private final EmployeeServiceV2 employeeServiceV2;

    // save new employee
    @PostMapping(value = "/employee")
    public EmployeeResDTO save(@RequestBody EmployeeReqV2DTO req) {
        return this.employeeServiceV2.saveEmployee(req);
    }
}
