package basic.ex5;

import java.util.Scanner;

public class NumFactorial {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a non-negative whole number. I will calculate its factorial.");
    int num = scanner.nextInt();
    scanner.close();
    int i = 1;
    int product = 1;
        while (i <= num) {
            product*=i;
            i++;
            }
    
    if (num>=0)
        System.out.println("The factorial of " + num + " is equal to " + product);
    else if (num < 0)
        System.out.println("Invalid input.");
    }  
} 