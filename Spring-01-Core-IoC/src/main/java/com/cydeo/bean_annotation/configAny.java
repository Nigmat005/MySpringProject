package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configAny {
    @Bean
    public String str(){
        return "Hello World";
    }
}
