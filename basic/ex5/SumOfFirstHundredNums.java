package basic.ex5;

public class SumOfFirstHundredNums {
public static void main(String[] args) {
    int i = 1;
    int sum = 0;
    while (i <= 100) {
        sum+=i;
        i++;}
    System.out.println("The sum of the first 100 numbers is equal to " + sum);
    }  
} 