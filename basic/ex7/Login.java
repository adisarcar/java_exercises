package basic.ex7;

public class Login {
    String username = "Bobby Joe";
    String password = "bobthebuilder:daGOAT3124";

    public Login(String username, String password) {
        if (this.username!=username)
            System.out.println("There are no users with the name " + username + " at the moment.");
        else
            System.out.println("User " + username + ". What is your password?");
            
            if (this.password!=password) 
                System.out.println("Invalid credentials. Please try again.");

                else
                    System.out.println("Congrats on logging in, " + username + "!");
    }

}