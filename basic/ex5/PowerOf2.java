package basic.ex5;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int numPowersOf2; //How many powers of 2 to compute
        int nextPowerOf2 = 0; //Current power of 2
        int exponent = 1; //Exponent for current power of 2 -- this
        //also serves as a counter for the loop   

        Scanner scan = new Scanner(System.in);
        System.out.println("How many (positive integer) powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();
        //print a message saying how many powers of 2 will be printed
        //initialize exponent -- the first thing printed is 2 to the what?
         
        while (nextPowerOf2 < numPowersOf2) {
            exponent*=2;
            nextPowerOf2++;
            System.out.print(exponent + " ");
        
         scan.close();
//print out current power of 2
//find next power of 2 -- how do you get this from the last one?
//increment exponent
}
}
}