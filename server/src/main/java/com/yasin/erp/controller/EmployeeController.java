package com.yasin.erp.controller;

import com.yasin.erp.model.dto.EmployeeReqDTO;
import com.yasin.erp.model.entity.Employee;
import com.yasin.erp.model.mapper.EmployeeMapper;
import com.yasin.erp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private EmployeeMapper employeeMapper;

    // get all
    @GetMapping(path = "/employee")
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }

    @GetMapping(path = "/employee-by-id")
    public String getEmployeeById(@RequestParam(name = "id") int id) {
        return "<h1 style='color: green;'>Yasin</h1>" + id;
    }

    @GetMapping(path = "/employee/{username}/username")
    public String getEmployeeUsername(@PathVariable(name = "username") String username) {
        return "<h1 style='color: blue;'>" + username + "</h1>";
    }

    // save new employee
    @PostMapping(path = "/save-employee")
    public EmployeeReqDTO save(@RequestBody EmployeeReqDTO req) {
        Employee employee = this.employeeMapper.toEntity(req);
        Employee saveEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDto(saveEmployee);
    }
}
