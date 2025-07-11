package basic.ex4;

import java.util.Scanner;

public class SimpleLoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username?");
        String username = scanner.next();
        System.out.println("Password?");
        String password = scanner.next();
        scanner.close();
        if (username.equals("chocolate") && password.equals("#Chokl1tR00les")) 
            System.out.println("Login Successful.");
        else
            System.out.println("Invalid Credentials.");
    }       
}
