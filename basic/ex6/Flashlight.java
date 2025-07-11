package basic.ex6;

public class Flashlight {
    boolean on = false;

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    boolean isOn() {
        return on;
    }

    public static void main (String[]args) {
        Flashlight f = new Flashlight();
        f.turnOn();
        System.out.println(f.isOn()); // Output: true
    }
}
