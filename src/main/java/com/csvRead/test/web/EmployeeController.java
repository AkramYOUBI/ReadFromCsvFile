package com.csvRead.test.web;

import com.csvRead.test.domain.DTOs.EmployeeDTO;
import com.csvRead.test.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("saveEmployee")
    public EmployeeDTO createEmployee() throws IOException {
        return employeeService.createEmployee();
    }
}
