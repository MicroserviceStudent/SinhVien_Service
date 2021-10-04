package com.example.sinhvien_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SinhVienServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SinhVienServiceApplication.class, args);
    }

    @Bean
    //@LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
