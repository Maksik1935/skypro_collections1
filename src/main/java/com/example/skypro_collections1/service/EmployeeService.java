package com.example.skypro_collections1.service;

import com.example.skypro_collections1.Employee;

import java.util.Set;

public interface EmployeeService {
    public Employee addEmployee(String firstName, String lastName);
    public Employee removeEmployee(String firstName, String lastName);
    public Employee findEmployee(String firstName, String lastName);
    public Set<Employee> getAll();
}
