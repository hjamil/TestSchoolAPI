package com.h.jamil.api.test.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableCaching
@EnableFeignClients
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableJpaRepositories(basePackages = "com.h.jamil.api.test.school.repository")
@ComponentScan(basePackages = {"com.h.jamil.api.test.school", "com.h.jamil.api.framework"})
public class SchoolTestAPIApp {

    public static void main(String[] args) {
        SpringApplication.run(SchoolTestAPIApp.class, args);
    }
}
