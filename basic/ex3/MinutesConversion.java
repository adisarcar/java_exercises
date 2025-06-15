package basic.ex3;

import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random number of minutes:");
        int minutes = scanner.nextInt();
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println("After " + minutes + " minutes, " + hours + " hours and " + remainingMinutes + " minutes would have passed.");
        scanner.close();
    }
}