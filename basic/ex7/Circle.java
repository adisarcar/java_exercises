package basic.ex7;

public class Circle {
    static double pi = 3.14159;
    double radius;

    double getCircleArea(double radius) {
        this.radius = radius;
        return (radius*radius*pi);
    }

    double getCirclePerimeter (double radius) {
        this.radius = radius;
        return (2*radius*pi);
    }
}