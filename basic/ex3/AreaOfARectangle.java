package basic.ex3;

import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        int lengthOfRectangle = scanner.nextInt();
        System.out.println("What is the width of your rectangle?");
        int widthOfRectangle = scanner.nextInt();
        int AreaOfARectangle = lengthOfRectangle * widthOfRectangle;
        System.out.println("The area of your rectangle with a length of " + lengthOfRectangle + " and a width of " + widthOfRectangle + " is: " + AreaOfARectangle);
    }
}