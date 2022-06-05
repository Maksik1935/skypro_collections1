package com.example.skypro_collections1.controller;

import com.example.skypro_collections1.Employee;
import com.example.skypro_collections1.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(String firstName, String lastName) {
        return employeeService.addEmployee(firstName, lastName);
    }
    @GetMapping("/remove")
    public Employee removeEmployee(String firstName, String lastName) {
        return employeeService.removeEmployee(firstName, lastName);
    }
    @GetMapping("/find")
    public Employee findEmployee(String firstName, String lastName) {
        return employeeService.findEmployee(firstName, lastName);
    }

    @GetMapping("/getAll")
    public Set<Employee> removeEmployee() {
        return employeeService.getAll();
    }
}
