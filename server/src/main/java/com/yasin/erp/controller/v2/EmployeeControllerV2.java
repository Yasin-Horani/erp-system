package com.yasin.erp.controller.v2;



import com.yasin.erp.model.dto.EmployeeResDTO;
import com.yasin.erp.model.dto.v2.EmployeeReqV2DTO;
import com.yasin.erp.service.v2.EmployeeServiceV2;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/employees/v2")
public class EmployeeControllerV2 {

    private final EmployeeServiceV2 employeeServiceV2;

    // save new employee
    @PostMapping(value = "/employee")
    public EmployeeResDTO save(@RequestBody @Valid EmployeeReqV2DTO req) {
        return this.employeeServiceV2.saveEmployee(req);
    }


    @ExceptionHandler(BindException.class)
    public ResponseEntity<Map<String, List<String>>> handleBindException(BindException e) {
        List<String> errors = e.getAllErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());

        Map<String, List<String>> errMap = new HashMap<>();
        errMap.put("errors", errors);

        return new ResponseEntity<>(errMap, HttpStatus.BAD_REQUEST);
    }

}
