package com.example.week05_lap05www;

import com.example.entities.Candidate;
import com.example.repositories.CandidatRopository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication(scanBasePackages = "com.example")
public class Week05Lap05WwwApplication {
    private static final Logger log = LoggerFactory.getLogger(Week05Lap05WwwApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(Week05Lap05WwwApplication.class, args);
    }
    //test
    @Bean
    public CommandLineRunner sampleRecords(CandidatRopository candidateRepository){
        return args -> {
            List<Candidate> list = candidateRepository.findAll();
            for (Candidate candidate:list
                 ) {
                System.out.println(candidate);
            }
        };
    }
}
