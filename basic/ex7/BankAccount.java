package basic.ex7;

public class BankAccount {
    int accountNumber;
    int balance;

    int deposit(int sum) {
        balance += sum;
        return balance;
    }

    int withdraw (int sum) {
        balance -= sum;
        return balance;
    }

    void getBalance() {
        System.out.println(balance);
    }
}

