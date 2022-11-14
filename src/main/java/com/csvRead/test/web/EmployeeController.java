package com.csvRead.test.web;

import com.csvRead.test.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(path = "saveEmployee", method = { RequestMethod.GET, RequestMethod.POST })
    public void createEmployee() throws IOException {
        employeeService.createEmployee();
    }
}
