package basic.ex7;

public class Employee {
    int age = 55;
    double salary = 123456;
    String name = "ABC 123";

    public Employee(String name, int age, double salary) {
        System.out.println(name + " " + age + " " + salary);
    }

    public Employee (String name, int age) {
        System.out.println (name + " " + age);
    }

    public Employee (int age, double salary) {
        System.out.println (age + " " + salary);
    }

    public Employee (String name, double salary) {
        System.out.println(name + " " + salary);
    }

    public Employee(String name) {
        System.out.println(name);
    }

    public Employee (double salary) {
        System.out.println(salary);
    }

    public Employee (int age) {
        System.out.println(age);
    }

    public Employee() {
        System.out.println(name + " " + age + " " + salary);
    }
}