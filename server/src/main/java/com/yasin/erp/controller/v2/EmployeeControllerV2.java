package com.yasin.erp.controller.v2;

import com.yasin.erp.model.dto.EmployeeResDTO;
import com.yasin.erp.model.dto.v2.EmployeeReqV2DTO;
import com.yasin.erp.model.entity.Employee;
import com.yasin.erp.service.v2.EmployeeServiceV2;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/employees/v2.1.0")
@Profile(value = {"prod"})
public class EmployeeControllerV2 {

    private final EmployeeServiceV2 employeeServiceV2;

    // save new employee
    @PostMapping(value = "/employee")
    public EmployeeResDTO save(@RequestBody @Valid EmployeeReqV2DTO req) {
        return this.employeeServiceV2.saveEmployee(req);
    }

    // get all employees
    @GetMapping(path = "/employee")
    public List<Employee> getEmployee() {
        return this.employeeServiceV2.getAllEmplyee();
    }
}
