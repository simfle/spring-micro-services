package com.simfle.micro.simfleeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SimfleEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimfleEurekaApplication.class, args);
    }

}
