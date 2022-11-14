package com.csvRead.test.service;

import com.csvRead.test.domain.DTOs.EmployeeDTO;
import com.csvRead.test.domain.Employee;
import com.csvRead.test.domain.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    String line="";
    public void createEmployee() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/file/test.csv"));
        while((line = br.readLine()) != null){
            String[] data = line.split(",");
            Employee employee = new Employee();
            employee.setName(data[0]);
            employee.setAge(Integer.valueOf(data[1]));
            employee.setJob(data[2]);
            employee.setCity(data[3]);
            employee.setSalary(Double.valueOf(data[4]));

            employeeRepository.save(employee);
        }
    }
}
