package basic.ex3;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String nameOfPerson = scanner.nextLine();
        scanner.close();
        // Output the collected information
        System.out.println("Hello, " + nameOfPerson + "!"); 
    }
}