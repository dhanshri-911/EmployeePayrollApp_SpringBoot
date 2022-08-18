package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.example.employeepayrollapp.exception.EmployeePayrollException;
import com.example.employeepayrollapp.model.EmployeePayrollData;
import com.example.employeepayrollapp.repository.EmployeePayrollRepo;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EmployeePayrollServices {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    EmployeePayrollRepo employeePayrollRepo;

    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollRepo.findAll();
    }

    public EmployeePayrollData getEmployeePayrollDataById(int empID) {
        return employeePayrollRepo.findById(empID)
                .orElseThrow(() -> new EmployeePayrollException("Employee Id not Found!!!"));
    }

    public EmployeePayrollData addEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = modelMapper.map(employeePayrollDTO,EmployeePayrollData.class);
        // employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
        return employeePayrollRepo.save(employeePayrollData);
    }

    public EmployeePayrollData updateEmployeeData(int empID, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
        //employeePayrollData.updateData(employeePayrollDTO);
        modelMapper.map(employeePayrollDTO,employeePayrollData);
        return employeePayrollRepo.save(employeePayrollData);
    }
    public void deleteEmployeePayrollData(int empID) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
        employeePayrollRepo.delete(employeePayrollData);
    }

    public List<EmployeePayrollData> getEmployeeByDepartment(String department) {
        return employeePayrollRepo.findEmployeeByDepartment(department);
    }

}
