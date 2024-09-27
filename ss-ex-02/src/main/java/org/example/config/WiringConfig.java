package org.example.config;

import org.example.models.Dog;
import org.example.models.Parrot;
import org.example.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.models"})
public class WiringConfig {
    // an aggregation example (Person has a Parrot)

    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Polly");
        return parrot;
    }
    @Bean
    // autowiring by method parameter
    // here the dog is autowired by the method parameter
    // and the dog is autowired by the component scan
    public Person person(Dog dog) {
        Person person = new Person();
        person.setName("John");
        // direct method call to set the parrot
        person.setDog(dog);
        person.setParrot(parrot());
        return person;
    }
}
