package com.icon.item.controller;

import com.icon.item.dto.Employee;
import com.icon.item.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by A541351 on 11/16/2016.
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public void save(@RequestBody List<Employee> e)
    {
        empService.saveEmployee(e);
    }

}
