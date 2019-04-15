package main;

import config.ProjectConfig;
import objects.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String [] args) {
        try(AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Cat c = context.getBean(Cat.class);
            System.out.println(c.name);
        }
    }
}
