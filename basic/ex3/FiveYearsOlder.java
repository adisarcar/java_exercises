package basic.ex3;

import java.util.Scanner;

public class FiveYearsOlder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int currentAge = scanner.nextInt();
        int ageInFiveYears = (currentAge + 5); 
        scanner.close(); 
        System.out.println("Your age in five years will be: " + ageInFiveYears);
    }
}