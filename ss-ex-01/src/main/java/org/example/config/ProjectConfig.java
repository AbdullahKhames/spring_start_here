package org.example.config;

import org.example.models.Parrot;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@Configurable
@ComponentScan("org.example.config")
public class ProjectConfig {

    @Bean(name = {"parrot", "parrot1"})
    @Primary
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Polly");
        return p;
    }
    @Bean(value = "parrot2")
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("twetty");
        return p;
    }
    @Bean("parrot3")
    public Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("canary");
        return p;
    }
}
