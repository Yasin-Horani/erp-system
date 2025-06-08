package com.yasin.erp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {


    @GetMapping(path = "/employee")
    public String getEmployee(){
        return "<h1 style='color: red;'>Yasin</h1>";
    }

    @GetMapping(path = "/employee-by-id")
    public String getEmployeeById(@RequestParam(name = "id") int id){
        return "<h1 style='color: green;'>Yasin</h1>"+ id;
    }
}
