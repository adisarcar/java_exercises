package basic.ex7;

public class Fan {
    int speed;
    double radius;
    String color;

    public Fan(int speed, double radius, String color) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    void displayFan() {
        System.out.println("The speed of this fan is " + speed + ", the radius of this fan " + radius + ", and the color of this fan, as you can clearly see, is " + color + ".");
    }
}