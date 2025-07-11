package basic.ex3;

import java.util.Scanner;

public class RemainderFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter your second number:");
        int lastInt = scanner.nextInt();
        int remainder = firstInt % lastInt;
        System.out.println("The remainder of " + firstInt + " divided by " + lastInt + " is: " + remainder);
        scanner.close();
        }
    }
