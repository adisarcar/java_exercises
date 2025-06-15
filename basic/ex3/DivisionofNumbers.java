package basic.ex3;

import java.util.Scanner;
public class DivisionofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter your second number:");
        int lastInt = scanner.nextInt();
        int division = firstInt / lastInt;
        System.out.println("The division of your first number " + firstInt + " by your second number " + lastInt + " is: " + division);
        }
    }
