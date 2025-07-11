package basic.ex6;

public class RectangleTest {
    public static void main(String[]args) {
        Rectangle rect1 = new Rectangle();
        rect1.length = 10;
        rect1.width = 15;

        Rectangle rect2 = new Rectangle();
        rect2.length = 7;
        rect2.width = 3;

        rect1.display();
        rect2.display();
    }
}