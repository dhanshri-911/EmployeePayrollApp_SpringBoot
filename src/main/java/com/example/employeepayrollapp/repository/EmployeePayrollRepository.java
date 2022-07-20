package com.example.employeepayrollapp.repository;


import com.example.employeepayrollapp.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeeDetails,Integer> {
}

