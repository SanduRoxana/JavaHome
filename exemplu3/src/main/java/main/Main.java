package main;

import config.ProjectConfig;
import model.BankAccount;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.BankAccountService;
import service.TransactionService;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(ProjectConfig.class)) {

//            transactionService creat cu Adnotari si doar cu Bean-ul transactionRepository

//            TransactionService transactionService =
//                    context.getBean(TransactionService.class);
//
//            System.out.println(transactionService);

            BankAccount bankAccount1 = new BankAccount();
            bankAccount1.setBalance(500.00);
            bankAccount1.setIban("1");
            bankAccount1.setOwnerName("Name1");

            BankAccount bankAccount2 = new BankAccount();
            bankAccount2.setBalance(300.00);
            bankAccount2.setIban("2");
            bankAccount2.setOwnerName("Name2");

            BankAccountService bankAccountService =
                    context.getBean(BankAccountService.class);

            bankAccountService.addBankAccount(bankAccount1);
            bankAccountService.addBankAccount(bankAccount2);

            System.out.println(bankAccount1);
            System.out.println(bankAccount2);

            bankAccountService.transferMoney("1", "2", 200);

            System.out.println(bankAccount1);
            System.out.println(bankAccount2);


        }
    }
}
