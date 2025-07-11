package basic.ex4;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What score did you get on your last test?");
        int testScore = scanner.nextInt();
        scanner.close();
        if (testScore>=90 && testScore<=100) 
            System.out.println("Your test score is an A."); 
        else if (testScore>=80 && testScore<90)
            System.out.println("Your test score is a B."); 
        else if (testScore>=70 && testScore<80)
            System.out.println("Your test score is a C.");
        else if (testScore>=60 && testScore<70)
            System.out.println("Your test score is a D.");
        else if (testScore>=0 && testScore<60)
            System.out.println("Your test score is an F.");
        else
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
    }
}
