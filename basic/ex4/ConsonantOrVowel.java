package basic.ex4;

import java.util.Scanner;

public class ConsonantOrVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a random letter. I shall determine whether it is a consonant or vowel");
        char randLetter = scanner.next().charAt(0);
        scanner.close();
        if (randLetter == 'a' || randLetter == 'e' || randLetter == 'i' ||randLetter == 'o' || randLetter == 'u') 
            System.out.println("Your character is a vowel.");
        else 
            System.out.println("Your character is a consonant."); 
    }
}
