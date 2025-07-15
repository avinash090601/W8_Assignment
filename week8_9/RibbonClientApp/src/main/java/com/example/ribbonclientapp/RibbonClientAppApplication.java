package com.example.ribbonclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonClientAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonClientAppApplication.class, args);
    }
}
