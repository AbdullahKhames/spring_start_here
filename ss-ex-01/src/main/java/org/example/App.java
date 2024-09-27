package org.example;

import org.example.config.ProjectConfig;
import org.example.model_not_annotated.Dog;
import org.example.models.Cat;
import org.example.models.Parrot;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // getting bean by type while there is 3 beans of that type
        // by primary attribute
        // this is defined in config class and @bean annotation and @Primary annotation
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        // getting bean by name
        Parrot p1 = context.getBean("parrot", Parrot.class);
        System.out.println(p.getName());
        // changing name of instance p1 which points to the same bean as p
        p1.setName("twetty");
        System.out.println(p.getName());
        // getting bean cat by type this is defined by stereotype annotation @Component
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getName());


        // registering bean by type and adding properties to it and init method
        // by using BeanDefinition interface and lambda expression
        if (!context.containsBean("dog")){
            context.registerBean("dog", Dog.class, Dog::new, bd -> {
                bd.getPropertyValues().add("name", "Rex");
                bd.getPropertyValues().add("age", 3);
            }, (bd) -> System.out.println("init dog"));
        }
        Dog dog = context.getBean(Dog.class);
        System.out.println(dog.getName());
    }
}
