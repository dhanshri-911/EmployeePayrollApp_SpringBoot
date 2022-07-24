package com.example.employeepayrollapp.repository;

import com.example.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepo extends JpaRepository<EmployeePayrollData,Integer> {
}
