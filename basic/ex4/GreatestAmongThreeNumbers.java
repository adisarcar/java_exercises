package basic.ex4;

import java.util.Scanner;

public class GreatestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter your second number:");
        int secondInt = scanner.nextInt();
        System.out.println("Please enter your third number:");
        int thirdInt = scanner.nextInt();
        int biggestNumber;
        if (firstInt>secondInt && firstInt>thirdInt)
            biggestNumber = firstInt;
        else if (secondInt>firstInt && secondInt>thirdInt)
            biggestNumber = secondInt;
        else
            biggestNumber = thirdInt;
        System.out.println("The greatest number among " + firstInt + ", " + secondInt + ", and " + thirdInt + " is: " + biggestNumber);
        scanner.close();
    }
}