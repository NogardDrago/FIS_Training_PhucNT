package com.pluralsight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJDBCApplication
{
    public static void main(String[] args) throws Exception {
        ApplicationContext appContext = SpringApplication.run(SpringBootJDBCApplication.class, args);
    }
}