package org.example.models;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name;

    public Dog() {
        name = "Fido";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Dog: " + name;
    }
}
