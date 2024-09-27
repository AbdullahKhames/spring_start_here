package org.example.main;

import org.example.config.ProjectConfig;
import org.example.models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ParrotName {

    public String getName() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        return p.getName();
    }

}
