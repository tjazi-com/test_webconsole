package com.tjazi.test.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.tjazi")
@SpringBootApplication
@EnableAutoConfiguration
@Configuration

public class TestconsoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestconsoleApplication.class, args);
    }
}
