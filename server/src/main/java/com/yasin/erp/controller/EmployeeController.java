package com.yasin.erp.controller;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.dto.EmployeeResDto;
import com.yasin.erp.model.entity.Employee;
import com.yasin.erp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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

    // PASS
    @GetMapping(path = "/employee-by-id")
    public String getEmployeeById(@RequestParam(name = "id") int id) {
        return "<h1 style='color: green;'>Yasin</h1>" + id;
    }

    // PASS
    @GetMapping(path = "/employee/{username}/username")
    public String getEmployeeUsername(@PathVariable(name = "username") String username) {
        return "<h1 style='color: blue;'>" + username + "</h1>";
    }

    // save new employee
    @PostMapping(path = "/save-employee")
    public EmployeeResDto save(@RequestBody EmployeeReqDTO req) {
        return this.employeeService.addNewEmpolyee(req);
    }
}
