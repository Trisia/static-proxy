package com.machine.demo.staticproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StaticProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaticProxyApplication.class, args);
    }

}
