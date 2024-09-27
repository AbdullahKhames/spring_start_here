package org.example.models;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;

    public Cat() {
        this.name = "garfield";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
