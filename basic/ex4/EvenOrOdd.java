package basic.ex4;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a random number. I shall determine whether it is even or odd");
        int randNumber = scanner.nextInt();
        scanner.close();
        if (randNumber%2 == 1) 
            System.out.println("Your number " + randNumber + " is odd."); 
        else 
            System.out.println("Your number " + randNumber + " is even."); 
    }
}
