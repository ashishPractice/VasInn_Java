package day13;

import java.util.Scanner;

// An example of runtime polymorphism (dynamic binding) which can be achieved by overridding of method
public class AccountTest {

    public static void main(String[] args) {
        Account account = null;
        System.out.println("Enter choice::");
        String choice = new Scanner(System.in).next();

        switch (choice) {
            case "saving":
                account = new SavingAccount();
                break;

            case "current":
                account = new CurrentAccount();
                break;

            default:
                System.out.println("wrong choice");

        }

        if(account !=null){
            account.openAccount();
        }
    }
}
