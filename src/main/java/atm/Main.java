package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
        Bank bank = new Bank("My Bank", dataSourceFile);
        ATM atm = new ATM(bank);
        ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);
        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
