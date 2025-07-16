package basic.ex7;

import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        int doorArea = 20;
        int windowArea = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("As the painter you hired to coat your rectangular bedroom, I would like to know how much paint I need to bring to paint it. Thus, I'll be asking the proportions of your room.");
        
        System.out.println("What is the length of your house (in feet)?");
        int length = scanner.nextInt();

        System.out.println("What is the width of your house (in feet)?");
        int width = scanner.nextInt();

        System.out.println("What is the height of your house (in feet)?");
        int height = scanner.nextInt();

        System.out.println("Since you told me you don't want your doors and windows painted, how many doors you have?");
        int totalDoors = scanner.nextInt();

        System.out.println("Mm-hmm, and doors?");
        int totalWindows = scanner.nextInt();

        scanner.close();

        double paintNeeded = (((length * width * height)-(doorArea*totalDoors + windowArea*totalWindows))/COVERAGE);

        System.out.println("To cover your room, of proportions " + length + " feet long, " + width + " feet wide, and " + height + " feet tall, I will need " + paintNeeded + " gallons of paint.");

    }
}
