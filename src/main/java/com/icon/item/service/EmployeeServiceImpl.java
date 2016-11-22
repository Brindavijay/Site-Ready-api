package com.icon.item.service;

import com.icon.item.dao.EmployeeRepository;
import com.icon.item.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by A541351 on 11/16/2016.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public void saveEmployee(List<Employee> e){
        employeeRepository.save(e);
    }


    public Employee findEmployee(long id)
    {
       return employeeRepository.findByEmpId(id);
    }


    public List<Employee> findEmployees(int age) {

        return employeeRepository.findByEmpAge(age);

    }
}
