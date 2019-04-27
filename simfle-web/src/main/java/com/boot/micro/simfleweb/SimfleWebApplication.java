package com.boot.micro.simfleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SimfleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimfleWebApplication.class, args);
    }

}
