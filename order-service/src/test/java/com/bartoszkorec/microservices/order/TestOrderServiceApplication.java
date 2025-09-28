package com.bartoszkorec.microservices.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.testcontainers.utility.TestcontainersConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(OrderServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
