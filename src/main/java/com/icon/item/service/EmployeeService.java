package com.icon.item.service;

import com.icon.item.dto.Employee;

import java.util.List;

/**
 * Created by A541351 on 11/16/2016.
 */
public interface EmployeeService {

    void saveEmployee(List<Employee> e);

    Employee findEmployee(long id);

    List<Employee> findEmployees(int age);
}
