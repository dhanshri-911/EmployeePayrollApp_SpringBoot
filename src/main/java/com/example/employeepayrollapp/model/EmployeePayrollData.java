package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.DTO.EmployeePayrollDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@Entity
@Table(name= "Employee_Payroll")
@NoArgsConstructor
public class EmployeePayrollData {
    @Id
    @GeneratedValue
    @Column(name = "emp_id")
    private int employeeID;


    private String name;
    private int salary;
    private String gender;
    private LocalDate joiningDate;
    private String note;
    private String profilePic;

    @ElementCollection
    @CollectionTable(name = "Employee_Department", joinColumns = @JoinColumn(name= "id"))
    private List<String> department;

    //public EmployeePayrollData(){}

//    public void updateData(EmployeePayrollDTO employeePayrollDTO) {
//        this.name = employeePayrollDTO.name;
//        this.salary = employeePayrollDTO.salary;
//        this.gender = employeePayrollDTO.gender;
//        this.note = employeePayrollDTO.note;
//        this.joiningDate = employeePayrollDTO.joiningDate;
//        this.profilePic = employeePayrollDTO.profilePic;
//        this.department = employeePayrollDTO.department;
//    }
//    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
////        this.employeeID = empID;          // Id will be autogenerated, hence not required now.
//        this.name = employeePayrollDTO.name;
//        this.salary = employeePayrollDTO.salary;
//        this.gender = employeePayrollDTO.gender;
//        this.note = employeePayrollDTO.note;
//        this.joiningDate = employeePayrollDTO.joiningDate;
//        this.profilePic = employeePayrollDTO.profilePic;
//        this.department = employeePayrollDTO.department;
//    }

    // No need to write setters and getters as we have added @Data annotation.

//    public int getEmployeeID() {
//        return employeeID;
//    }
//
//    public void setEmployeeID(int employeeID) {
//        this.employeeID = employeeID;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

}
