package basic.ex4;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int personAge = scanner.nextInt();
        scanner.close();
        if (personAge < 0) 
            System.out.println("Invalid age. Please enter a non-negative number.");
        else if (personAge < 18)
            System.out.println("You are a minor.");
        else if (personAge < 65 && personAge >= 18)
            System.out.println("You are an adult.");
        else if (personAge > 65)
            System.out.println("You are a senior."); 
    }
}
