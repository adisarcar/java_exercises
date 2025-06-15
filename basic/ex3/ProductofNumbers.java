package basic.ex3;

import java.util.Scanner;

public class ProductofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter your second number:");
        int lastInt = scanner.nextInt();
        int product = firstInt * lastInt;
        System.out.println("The product of your first number " + firstInt + " and your second number " + lastInt + " is: " + product);
    }
}