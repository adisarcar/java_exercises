package basic.ex7;

public class Rectangle {
    int length;
    int width;
    
    int getArea() {
        return (length*width);
    }

    int getPerimeter () {
        return (2*(length+width));
    }
}