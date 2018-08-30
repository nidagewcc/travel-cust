package com.phoenix.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.phoenix.travel")
public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(Startup.class);
    }
}
