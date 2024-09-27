package org.example.config;

import org.example.models.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.models"})
public class AutoWiringConfig {

    @Bean
    public Cat cat1() {
        Cat cat = new Cat();
        cat.setName("tom");
        return cat;
    }
    @Bean
    public Cat cat2() {
        Cat cat = new Cat();
        cat.setName("tom2");
        return cat;
    }
}
