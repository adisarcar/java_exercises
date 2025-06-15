package ex4;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a year, any year.");
        int anyYear = scanner.nextInt();
        scanner.close();
        int leapYear = 0;
        if (anyYear%4 == 0)
             System.out.println("The year " + anyYear + " is a leap year.");
            else if (anyYear%100==0)
                System.out.println("The year " + anyYear + " is not a leap year.");
                else if (anyYear%400==0)
                    System.out.println("The year " + anyYear + " is a leap year.");
        if (anyYear%4 != 0)
            System.out.println("The year " + anyYear + " is not a leap year.");
    }
}
