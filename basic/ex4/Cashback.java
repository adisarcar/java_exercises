package basic.ex4;

import java.util.Scanner;

public class Cashback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your membership level: Silver, Gold, or Platinum?");
        String membershipLevel = scanner.nextLine();
        System.out.println("What is the amount of your purchase?");
        int purchaseAmount = scanner.nextInt();
        float cashback = 0;
        scanner.close();
        if (purchaseAmount<=100 && purchaseAmount>=0); {
            if (membershipLevel.equalsIgnoreCase("Platinum"))
                cashback = (float) (purchaseAmount * 0.03);
             else if (membershipLevel.equalsIgnoreCase("Gold")) 
                cashback = (float) (purchaseAmount * 0.02);
             else if (membershipLevel.equalsIgnoreCase("Silver"))
                cashback = (float) (purchaseAmount * 0.01);
        }
        if (purchaseAmount>100 && purchaseAmount<=500) {
            if (membershipLevel.equalsIgnoreCase("Platinum")) 
                cashback = (float) (purchaseAmount * 0.04);
             else if (membershipLevel.equalsIgnoreCase("Gold")) 
                cashback = (float) (purchaseAmount * 0.03);
             else if (membershipLevel.equalsIgnoreCase("Silver"))    
                cashback = (float) (purchaseAmount * 0.02);
        }
        if (purchaseAmount>500) {
            if (membershipLevel.equalsIgnoreCase("Platinum")) 
                cashback = (float) (purchaseAmount * 0.05);
             else if (membershipLevel.equalsIgnoreCase("Gold")) 
                cashback = (float) (purchaseAmount * 0.04);
             else if (membershipLevel.equalsIgnoreCase("Silver"))
                cashback = (float) (purchaseAmount * 0.03);
        }
        if (membershipLevel.equalsIgnoreCase("Silver")&&purchaseAmount>=0) 
            System.out.println("The money you have received as cashback is: $" + cashback);
        if(membershipLevel.equalsIgnoreCase("Gold")&&purchaseAmount>=0)
            System.out.println("The money you have received as cashback is: $" + cashback);
        if (membershipLevel.equalsIgnoreCase("Platinum")&&purchaseAmount>=0)
            System.out.println("The money you have received as cashback is: $" + cashback);
        
      

    }
}