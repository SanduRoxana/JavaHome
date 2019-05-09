import databaseConfig.DatabaseConfig;
import entities.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.PersonRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class)) {
            PersonRepository personRepository = context.getBean(PersonRepository.class);
            personRepository.findAll().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
