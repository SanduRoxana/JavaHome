package main;

import beans.TransactionRepository;
import beans.TransactionService;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

//            by Type

//            TransactionRepository transactionRepository = context.getBean(TransactionRepository.class);
//            System.out.println(transactionRepository);

//            by Name

//            TransactionRepository transactionRepository =
//                    context.getBean("transactionRepository", TransactionRepository.class);
//            System.out.println(transactionRepository);

//            First Bean - Singleton

            TransactionRepository transactionRepository1 =
                    context.getBean("transactionRepository", TransactionRepository.class);

            TransactionRepository transactionRepository2 =
                    context.getBean("transactionRepository", TransactionRepository.class);

            transactionRepository2.setNume("Singleton");

            System.out.println(transactionRepository1);
            System.out.println(transactionRepository2);

//            Second Bean - Prototype

            TransactionRepository transactionRepository3 =
                    context.getBean("transactionRepository2", TransactionRepository.class);

            TransactionRepository transactionRepository4 =
                    context.getBean("transactionRepository2", TransactionRepository.class);

            transactionRepository4.setNume("Prototype");

            System.out.println(transactionRepository3);
            System.out.println(transactionRepository4);

//            transactionService creat fara Adnotari si cu Bean-ul transactionService care apeleaza transactionRepository

            TransactionService transactionService =
                    context.getBean(TransactionService.class);

            System.out.println(transactionService);

        }
    }
}
