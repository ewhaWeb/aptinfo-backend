package com.ewha.aptinfobackend;

import com.ewha.aptinfobackend.repository.RankedAptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AptinfoBackendApplication {
    @Autowired
    RankedAptRepository rankedAptRepository;

    public static void main(String[] args) {
        SpringApplication.run(AptinfoBackendApplication.class, args);

    }



}
