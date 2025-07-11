package basic.ex3;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite number?");
        int favNumber = scanner.nextInt();
        int magicNumber = (3 * favNumber) - 1;  
        System.out.println("Your magic number is: " + magicNumber);
        scanner.close();
    }
}