package com.example.employeepayrollapp.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.*;
//import java.time.LocalDate;
import java.time.LocalDate;
import java.util.List;

@ToString
public class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z]{1}[A-Za-z\\s]{1,}$", message = "Invalid Name")      // if fails then, message will appear.
    public String name;

    @Min(value = 500, message = "Salary should be more than 500")
    public int salary;

    @Pattern(regexp = "Male|Female", message = "Gender should be Male or Female")
    public String gender;

    @JsonFormat(pattern = "dd MM yyyy")
    @NotNull(message = "startDate should Not be Empty")
    @PastOrPresent(message = "startDate should be past or present date")
    public LocalDate joiningDate;
    @NotEmpty(message = "Note cannot be Empty")
    public String note;

    public String profilePic;

    @NotNull(message = "Department cannot be Null")
    public List<String> department;

}