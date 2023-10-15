package com.bss.bssrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bss.bssrest.entity.Employee;
import com.bss.bssrest.repository.EmployeeRepository;

@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    private List<Employee> employeeList;

    @GetMapping("/staff/all-employees/")
    public List<Employee> getAllEmployees() {
        employeeList = employeeRepository.findAll();
        return employeeList;
    }

}
