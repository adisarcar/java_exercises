package basic.ex7;

public class LibraryBook {
    boolean bookCheckedOut = false;
    
    void borrow(String bookTitle) {

        if (bookCheckedOut = true)
            System.out.println("Oh, I'm sorry, " + bookTitle + " has already been checked out. May I reccomend you this book instead?");
        else
            System.out.println("You have successfully checked out " + bookTitle + ".");
        
        bookCheckedOut = true;

    }

    void returnBook(String bookTitle) {

        if (bookCheckedOut = true)
            System.out.println("You have successfully returned " + bookTitle + ".");
        else
            System.out.println("The book " + bookTitle + " hasn't checked out, or perhaps has already been returned. If you have made a mistake in the returning process, or a system error has occured, please try again.");
    }
}
