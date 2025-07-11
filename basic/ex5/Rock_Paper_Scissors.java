package basic.ex5;

import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args){
        String playAgain = "Y"; /*  */
        String personPlay; //User's play -- "R", "P", or "S"
        String computerPlay; //Computer's play -- "R", "P", or "S"
        int computerInt; //Randomly generated number used to determine

        Scanner scanner = new Scanner(System.in);

        while (playAgain.equals("Y")) { /*  */
        
            //Get player's play -- note that this is stored as a string /*  */
            System.out.println("Let's play rock-paper-scissors - R for Rock, P for paper, and S for scissors!");/*  */
            personPlay = scanner.next(); /*  */
            personPlay = personPlay.toUpperCase();
            System.out.println();
            /*  */
            //Make player's play uppercase for ease of comparison
            //Generate computer's play (0,1,2)
            computerInt = (int)((Math.random()*3)+1); //computer's play
            //Translate computer's randomly generated play to string
            if (computerInt == 1)/*  */
                computerPlay = "R"; /*  */
            else if (computerInt== 2)
                computerPlay = "S"; /*  */
            else
                computerPlay = "P";/*  */
            //Print computer's play
            //See who won. Use nested ifs instead of &&.
            if (personPlay.equals(computerPlay))
                System.out.println("It's a tie!");
            else if (personPlay.equals("R"))
                if (computerPlay.equals("S"))
                    System.out.println("Rock crushes scissors. You win!");
                else
                    System.out.println("Paper wraps around rock. You lose..."); 
            else if (personPlay.equals("S"))/*  */ 
                if (computerPlay.equals("P"))
                    System.out.println("Scissors cuts through paper. You win!");
                else
                    System.out.println("Rock crushes scissors. You lose...");/*  */
            else if (personPlay.equals("P"))/*  */ 
                if (computerPlay.equals("R"))
                    System.out.println("Paper wraps around rock. You win!");
                else
                    System.out.println("Scissors cuts through paper. You lose...");/*  *//*  */
            else
                System.out.println("Error. Please try again.");
            
            System.out.println();
            System.out.println("Do you wish to play again? Enter Y for Yes and N for No.");/*  */ 
            playAgain = scanner.next(); }
        
        scanner.close(); 
        System.out.println();
        System.out.println("Thanks for playing!");
        }
}
