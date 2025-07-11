package basic.ex4;

import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first side length of your triangle:");
        int firstSide = scanner.nextInt();
        System.out.println("Please enter the second side length of your triangle:");
        int secondSide = scanner.nextInt();
        System.out.println("Please enter the third side length of your triangle:");
        int thirdSide = scanner.nextInt();
        if ((firstSide + secondSide > thirdSide) && (firstSide + thirdSide > secondSide) && (secondSide + thirdSide > firstSide)) 
            System.out.println("The lengths " + firstSide + ", " + secondSide + ", and " + thirdSide + " can form a triangle.");
        else
            System.out.println("The lengths " + firstSide + ", " + secondSide + ", and " + thirdSide + " cannot form a triangle.");
        scanner.close();

    }
}