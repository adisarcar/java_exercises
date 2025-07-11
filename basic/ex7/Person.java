package basic.ex7;

public class Person {
    String name = "Jarvis";
    int birthYear = 1976;

    int getAge() {
        int age = 2025 - birthYear;
        return age;
    }
}