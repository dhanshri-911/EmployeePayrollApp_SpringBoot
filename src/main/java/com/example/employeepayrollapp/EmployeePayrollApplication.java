package com.example.employeepayrollapp;
import org.modelmapper.ModelMapper;
import org.springframework.context.ApplicationContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class EmployeePayrollApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeePayrollApplication.class, args);
        log.info("Employee Payroll Application Started in {} Environment",
                context.getEnvironment().getProperty("environment"));
        System.out.println("Welcome to Employee Payroll Application.");
    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}