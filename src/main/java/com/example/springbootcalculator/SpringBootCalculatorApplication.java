package com.example.springbootcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class SpringBootCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCalculatorApplication.class, args);
    }

}
