package basic.ex5;

import java.util.Scanner;/*  */

public class SummerActivites {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What temperature is it at the moment (in Fahrenheit)?");/*  */
        int temp = scanner.nextInt();
        scanner.close();
        if (temp>95||temp<20)/*  */
                System.out.println("Visit our shops!");/*  *//*  */
        else if (temp >= 80)/*  */ 
            System.out.println("I recommend you swim.");/*  */
        else if (temp<80 && temp>=60)
            System.out.println("I recommend you play tennis.");/*  */
        else if (temp>=40 && temp<60)/*  */
            System.out.println("I recommend you play golf.");/*  */
            /*  */
        else
            /*  */
            System.out.println("I recommend you ski.");
 /*  */
 /*  */
    }
}