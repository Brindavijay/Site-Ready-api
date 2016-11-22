package com.icon.item.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by A541351 on 11/16/2016.
 */
@Document
public class Employee {

    @Id
    private String id;

    private long empId;
    private String empName;
    private int empAge;
    private String empDesignation;
    private String empSex;
    private EmpAddress empAddress;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public EmpAddress getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(EmpAddress empAddress) {
        this.empAddress = empAddress;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }
}
