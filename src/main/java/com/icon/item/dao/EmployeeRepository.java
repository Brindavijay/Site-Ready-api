package com.icon.item.dao;

import com.icon.item.dto.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by A541351 on 11/16/2016.
 */
public interface EmployeeRepository extends MongoRepository<Employee,String>
{

  Employee findByEmpId(long empId);

    List<Employee> findByEmpAge(int empAge);
}
