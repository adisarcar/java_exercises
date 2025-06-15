package basic.ex3;

import java.util.Scanner;

public class DifferenceofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter your second number:");
        int lastInt = scanner.nextInt();
        int difference = firstInt - lastInt;
        System.out.println("The difference of your first number " + firstInt + " and your second number " + lastInt + " is: " + difference);
    }
}