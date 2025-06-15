package basic.ex2;

import java.util.Scanner;
import java.util.Random;
/**
Aditya Sarcar
6/7/25
Guessing Game File
Java Class
*/

public class GuessingGame {
    
    // Class to implement a simple guessing game
    // The user has to guess a number between 1 and 100
    // The user has a limited number of tries to guess the number
    
    // Instance variables
	private int numberToGuess;
    private int maxTries;
    
    //Constructor
    public GuessingGame(int maxTries) {
    	Random random = new Random();
    	this.numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
    	this.maxTries = maxTries;
    }
    
    // Method to start the game
    public void startGame() {
    	Scanner scanner = new Scanner(System.in);
      boolean hasGuessedCorrectly = false;
        
      System.out.println("Welcome to the Guessing Game!");
      System.out.println("You have " + maxTries + " tries to guess a number between 1 and 100.");

     	for (int i=0; i<maxTries; i++) {
        System.out.println("Guess a number between 1 and 100:");
        int userGuess = scanner.nextInt();
                
        if (checkGuess(userGuess))  {
          hasGuessedCorrectly = true;
          break;
        }
			}
            
      if (!hasGuessedCorrectly) {
        System.out.println("Sorry! You've run out of tries. The correct number was " + numberToGuess + ".");
      }
      
      scanner.close();
    }
      
    // Method to check the user's guess
    private boolean checkGuess(int guess) {
      if (guess==numberToGuess) {
      	System.out.println("Congratulations! You guessed the number: " + numberToGuess);
        return true;
      } else if (guess < numberToGuess) {
       	System.out.println("Too low!");
      } else {
       	System.out.println("Too high!");
      }
      return false;
    }
    
    // Main method
    public static void main(String[] args) {
    	GuessingGame game = new GuessingGame(5); // 5 tries
      game.startGame();
    }
}