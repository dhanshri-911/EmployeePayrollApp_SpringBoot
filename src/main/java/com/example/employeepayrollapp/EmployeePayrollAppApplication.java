package com.example.employeepayrollapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
         SpringApplication.run(EmployeePayrollAppApplication.class, args);
        // g.info("Employee Payroll Application Started in {} Environment",
        //         context.getEnvironment().getProperty("environment"));
        System.out.println("Welcome to Employee Payroll Application.");
    }
    // @Bean
    // public ModelMapper modelMapper(){
    //     return new ModelMapper();
    // }


}