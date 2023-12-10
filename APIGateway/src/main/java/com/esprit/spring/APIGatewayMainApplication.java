package com.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class APIGatewayMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(APIGatewayMainApplication.class, args);
    }
}
