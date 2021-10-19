package com.example.demo.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student matei = new Student(
                "Matei" ,
                "matei.tudor@gmail.com",
                LocalDate.of(2000, 1, 21),
                21
            );
            Student ana = new Student(
                    "Ana" ,
                    "ana.filofteia@gmail.com",
                    LocalDate.of(1994, 2, 18),
                    25
            );
            repository.saveAll(
                    List.of(matei, ana)
            );
        };
    }
}
