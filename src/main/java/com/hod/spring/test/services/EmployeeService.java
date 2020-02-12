package com.hod.spring.test.services;

import com.hod.spring.test.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeByName(String name);
    List<Employee> getAllEmployees();
}
