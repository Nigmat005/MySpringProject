package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class configApp {
    @Bean
    @Primary
    FullTimeMentor fullTimeMentor() {
        return new FullTimeMentor();
    }

    @Bean(name = "full2")
    FullTimeMentor fullTimeMentor2() {
        return new FullTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeMentor() {
        return new PartTimeMentor();
    }
}
