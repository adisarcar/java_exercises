package basic.ex5;

import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a whole number. I will print its multiplication table.");
    int num = scanner.nextInt();
    scanner.close();
    int i = 1;
    int product = 1;
    if (num < 0)
        System.out.println("Invalid input.");
    else
        while (i <= 10) {
            product=num*i;
            i++;
            System.out.println(product);
        }
    }  
} 