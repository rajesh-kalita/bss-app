package com.bss.bssrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bss.bssrest.entity.Employee;
import com.bss.bssrest.repository.EmployeeRepository;

@RestController
@RequestMapping("/staff/")
public class EmployeeController {
@Autowired
private EmployeeRepository employeeRepository;
// private List<employee> employeeList;
private List<Employee> employeeList;

    @RequestMapping("/all-employees/")
    @GetMapping
    public List<Employee> getAllEmployees() {
        employeeList = employeeRepository.findAll();
        return employeeList;
    }
    
    
}
