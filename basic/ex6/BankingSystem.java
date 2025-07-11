package basic.ex6;

public class BankingSystem {
    public static void main (String[]args) {
        BankAccount ba = new BankAccount();
        ba.deposit(100);
        ba.withdraw(30);
        ba.withdraw(50);
        ba.displayAccountInfo();
    }
}