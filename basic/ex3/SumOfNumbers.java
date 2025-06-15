package basic.ex3;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter your second number:");
        int lastInt = scanner.nextInt();
        int sum = firstInt + lastInt;
        System.out.println("The sum of your first number " + firstInt + " and your second number " + lastInt + " is: " + sum);
    }
}