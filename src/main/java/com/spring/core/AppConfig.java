package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Vehicle car(){
        return new Car(); // Spring IoC Container manages the object of Car Class
    }

    @Bean
    public Vehicle bike(){
        return new Bike(); // Spring IoC Container manages the object of Bike Class
    }

    @Bean
    public Vehicle cycle(){
        return new Cycle(); // Spring IoC Container manages the object of Cycle Class
    }

    @Bean
    public Traveler traveler(){
        return new Traveler(car()); // DI
    }
}
