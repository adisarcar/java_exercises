package basic.ex6;// fire veil wand or spirit sceptre better?

public class Rectangle {

    int length;
    int width;

    int getArea() {
        int areaOfRectangle = length * width;
        return areaOfRectangle;
    }

    int getPerimeter() {
        int perimeterOfRectangle = 2*(length + width);
        return perimeterOfRectangle; 
    }

    void display() {
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }

}
