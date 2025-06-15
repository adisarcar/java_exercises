package basic.ex3;

import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?"); //find name of user
        String nameOfPerson = scanner.nextLine();
        System.out.println("What is your age?"); //finds age of user
        int ageOfPerson = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("What is your favorite color?"); //finds favorite color of user
        String personFavColor = scanner.nextLine();
        scanner.close();
        // Output the collected information
        System.out.println("Your name is " + nameOfPerson + ", you are " + ageOfPerson + " years old, and your favorite color is " + personFavColor + ".");
    }
}