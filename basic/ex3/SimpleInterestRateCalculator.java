package basic.ex3;

import java.util.Scanner;

public class SimpleInterestRateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your principal amount?");
        int principalAmount = scanner.nextInt();
        System.out.println("What is your simple interest rate in percentage?");
        int simpleInterestRate = scanner.nextInt();
        System.out.println("What is the time in years you plan on investing this money?");
        int timeSpentInYears = scanner.nextInt();
        scanner.close();
        // Output the collected information
        int simpleInterest = (principalAmount * simpleInterestRate * timeSpentInYears) / 100;
        System.out.println("The simple interest on your principal amount of " + principalAmount + " at a rate of " + simpleInterestRate + "% for " + timeSpentInYears + " years is: " + simpleInterest);
    }
}