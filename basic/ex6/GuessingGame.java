package basic.ex6;

import java.util.Scanner;

public class GuessingGame {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        int randNumber = (int)((Math.random()*100)+1);
        
        System.out.println("I have chosen a random integer between 1 and 100. Let's see if you can guess it.");
        int guessedNumber = scanner.nextInt();
        String playAgain = "Y";

        while (playAgain.equals("Y")) {
            while (guessedNumber != randNumber) {
                if (guessedNumber>randNumber)
                    System.out.println("Oops! Your number's slightly too high!");
                else
                    System.out.println("Oof! Just a little bit lower!");
            
                System.out.println("Try guessing again!");
                int newGuess = scanner.nextInt();
                guessedNumber = newGuess;
            }
            System.out.println("You got it! The number is " + randNumber + "!");
            
            int newNumber = (int)((Math.random()*100)+1);
            randNumber = newNumber;

            System.out.println("Do you wanna play again? (Answer Y for Yes and N for No)");
            String wannaPlay = scanner.next();
            playAgain = wannaPlay;
        }
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}



