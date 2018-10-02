package com.cqrs.cqrsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CqrsExampleApplication {
    //https://blog.novatec-gmbh.de/event-sourcing-spring-boot-axon/
    public static void main(String[] args) {
        SpringApplication.run(CqrsExampleApplication.class, args);
    }
}
