package basic.ex3;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter your second number:");
        int secondInt = scanner.nextInt();
        System.out.println("Please enter your third number:");
        int thirdInt = scanner.nextInt();
        int averageOfThreeNumbers = (firstInt + secondInt + thirdInt)/ 3;
        System.out.println("The average of your first number " + firstInt + ", your second number " + secondInt + ", and your third number " + thirdInt + " is: " + averageOfThreeNumbers);
    }
}