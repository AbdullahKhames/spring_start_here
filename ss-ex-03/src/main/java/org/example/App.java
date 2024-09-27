package org.example;

import org.example.config.AutoWiringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoWiringConfig.class);
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("owner"));

    }
}
