package basic.ex3;

import java.util.Scanner;

public class AgeofPerson { //calculates the age of a person based on their year of birth
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year were you born?"); //finds the year for which user is born
        int dateOfBirth = scanner.nextInt();
        int personAge = 2025 - dateOfBirth; //calculates when age of user
        System.out.println("You're currently " + personAge + " years old."); //tells user their age
        scanner.close(); //closes the scanner to prevent resource leaks
    }
} 