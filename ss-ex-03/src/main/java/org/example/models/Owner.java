package org.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Owner {
    private String name;
    private final Cat cat;

    @Autowired
    // here autowired by qualifier is used
    // if there are multiple beans of the same type, then the name of the bean is used to autowire
    // i have a bean named cat1 and a bean named cat2
    // and bean named cat but that one created by spring @component annotation
    public Owner(@Qualifier("cat2") Cat cat) {
        this.cat = cat;
        this.name = "John Doe";
    }
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }
}
