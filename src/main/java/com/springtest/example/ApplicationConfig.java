package com.springtest.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean(name = "myBean")//by using name property we can give name to bean
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("My variable");
    }
}
