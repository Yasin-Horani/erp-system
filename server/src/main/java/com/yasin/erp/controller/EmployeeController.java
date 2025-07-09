package com.yasin.erp.controller;

import com.yasin.erp.model.dto.EmployeeDTO;
import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.dto.EmployeeResDto;
import com.yasin.erp.model.dto.UpdateEmployeeReqDTO;
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

    // get employee by id
    @GetMapping(value = "/employee/{id}")
    public EmployeeDTO getEmployee(@PathVariable Long id) {
        return this.employeeService.getEmployeeById(id);
    }
    // save new employee
    @PostMapping(value = "/employee")
    public EmployeeResDto save(@RequestBody EmployeeReqDTO req) {
        return this.employeeService.saveEmployee(req);
    }

    // update Employee
    @PutMapping(value = "/employee")
    public EmployeeResDto update(@RequestBody UpdateEmployeeReqDTO req) {
        return this.employeeService.updateEmployee(req);
    }

    // delete employee by id
    @DeleteMapping(value = "/employee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        this.employeeService.deleteEmployee(id);
    }

    // get random password
    @GetMapping("/pass")
    public String generatePassword() {
        return PasswordGeneratorUtility.generate();
    }
}
