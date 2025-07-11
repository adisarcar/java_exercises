package basic.ex7;

public class Book {
    String title;
    String author;
    int price;

    public Book (String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    void displayDetails() {
        System.out.println(title + " by " + author + ". Can be bought for " + price);
    }
}