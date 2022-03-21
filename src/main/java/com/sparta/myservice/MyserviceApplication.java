package com.sparta.myservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyserviceApplication.class, args);
    }
}
