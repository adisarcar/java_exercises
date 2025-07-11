package basic.ex7;

public class Student {
    String name;
    int grade;

    void setNameAndGrade(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    void getNameAndGrade() {
        System.out.println(name + ", " + grade);
    }
}