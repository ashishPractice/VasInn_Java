package lab1;

public class BankAccount {

    String name;
    double balance;
    int accountNumber;


    public BankAccount(String name, int accountNumber) {
        this.name = name;
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String name, double balance, int accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }


    public void deposite(double amount) {
        System.out.println("Balance before deposit: "+ balance);
        System.out.println("Deposite Amount: "+ amount);
        balance = balance + amount;
        display();
    }

    public void deposite(double amount, double interest) {
        System.out.println("Balance before deposit: "+ balance);
        System.out.println("Deposite Amount: "+ amount);
        System.out.println("Interest: "+(balance * interest / 100));
        balance = balance + amount + (balance * interest / 100);
        display();
    }

    public void withdraw(double amount) {
        System.out.println("Balance before withdrawl: "+ balance);
        System.out.println("Withdrawl Amount: "+ amount);
        balance = balance - amount;
        display();
    }

    public void withdraw(double amount, double fees) {
        System.out.println("Balance before withdrawl: "+ balance);
        System.out.println("Withdrawl Amount: "+ amount);
        System.out.println("Fees: "+ fees);
        balance = balance - amount - fees;
        display();
    }

    public void display() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Balance:" + balance);
        System.out.println("=============================================");
    }

    public static void main(String[] args) {

        BankAccount b1= new BankAccount("Ram",1000.0,001);
        b1.deposite(100.0);
        b1.withdraw(50.0);
        b1.deposite(200.0,25);
        b1.withdraw(100.0,10.0);

        BankAccount b2= new BankAccount("Shyam",002);
        b2.deposite(100.0);
        b2.withdraw(50.0);
        b2.deposite(200.0,25);
        b2.withdraw(100.0,10.0);

        BankAccount b3= new BankAccount("Hari",500.0,003);
        b3.deposite(100.0);
        b3.withdraw(50.0);
        b3.deposite(200.0,25);
        b3.withdraw(100.0,10.0);

    }
}
