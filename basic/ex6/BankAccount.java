package basic.ex6;

public class BankAccount {
    String accountNumber = "635345782";
    double balance;

    public void deposit (double amount) {
        balance += amount;
        System.out.println(balance);
    }

    public void withdraw (double amount) {
        balance -= amount;
        System.out.println(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println(accountNumber);
        System.out.println(balance);
    }
}