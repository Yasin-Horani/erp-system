package com.yasin.erp.controller;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.dto.EmployeeResDto;
import com.yasin.erp.model.entity.Employee;
import com.yasin.erp.service.EmployeeService;
import com.yasin.erp.utilities.PasswordGeneratorUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    // get all employees
    @GetMapping(path = "/employee")
    public List<Employee> getEmployee() {
        return this.employeeService.getAllEmplyee();
    }

    // save new employee
    @PostMapping(path = "/save-employee")
    public EmployeeResDto save(@RequestBody EmployeeReqDTO req) {
        return this.employeeService.addNewEmpolyee(req);
    }

    // get random password
    @GetMapping("/pass")
    public String generatePassword() {
        return PasswordGeneratorUtility.generate();
    }
}
