package org.example.main;

import org.example.config.ProjectConfig;
import org.example.models.Cat;
import org.example.models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CatName {
    public String catName() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Cat cat = context.getBean(Cat.class);
        return cat.getName();
    }
}
