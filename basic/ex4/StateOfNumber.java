package basic.ex4;

import java.util.Scanner;

public class StateOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a random number. I shall determine whether it is positive, negative, or equal to zero.");
        int randomNumber = scanner.nextInt();
        scanner.close();
        if (randomNumber>0) 
            System.out.println("Your number " + randomNumber + " is greater than zero."); 
        if (randomNumber<0) 
            System.out.println("Your number " + randomNumber + " is less than zero."); 
        else if (randomNumber == 0) 
            System.out.println("Your number " + randomNumber + " is equal to zero.");
    }
}
