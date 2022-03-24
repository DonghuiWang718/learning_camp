package com.example.learning_camp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.learning_camp.mapper")
public class LearningCampApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningCampApplication.class, args);
    }

}
