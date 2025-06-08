package com.yasin.erp.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/employee/{username}/username")
    public String getEmployeeUsername(@PathVariable(name = "username") String username){
        return "<h1 style='color: blue;'>"+username+"</h1>";
    }
}
