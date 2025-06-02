package com.example.capadonademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.capadonademo.entities")
@EnableJpaRepositories("com.example.capadonademo.repositories")
public class CapadonaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapadonaDemoApplication.class, args);
    }

}
