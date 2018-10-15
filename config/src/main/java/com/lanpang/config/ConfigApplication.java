package com.lanpang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
@RestController
public class ConfigApplication {
    @Value("${spring.cloud.config.server.git.username}")
    private String username;

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

    @GetMapping("/print")
    public String print() {
        return "username:" + username;
    }

}
