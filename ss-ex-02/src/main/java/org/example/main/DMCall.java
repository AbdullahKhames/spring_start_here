package org.example.main;

import org.example.config.WiringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DMCall {
    public String call() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WiringConfig.class);
        return context.getBean("person").toString();
    }
}
