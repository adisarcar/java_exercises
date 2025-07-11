package basic.ex5;/*  */

import java.util.Scanner;

public class ReversingNum {
    public static void main (String[]args) {/*  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a whole number. I shall reverse it."); /*  */
        int num =  scanner.nextInt(); /*  */
        scanner.close(); /*  */
        for (int i = 10; i < num; i*=10) {
            int k = num%i;/*  */
            System.out.print(k); /*  */
        } /*  */
    }
}