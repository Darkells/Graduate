package com.dark.graduate.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.dark.graduate.user.mapper")
@EnableDiscoveryClient
public class GraduateUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduateUserApplication.class, args);
    }

}
