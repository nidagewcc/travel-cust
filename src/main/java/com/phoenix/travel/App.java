package com.phoenix.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@SpringBootApplication
@ComponentScan("com.phoenix.travel")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
