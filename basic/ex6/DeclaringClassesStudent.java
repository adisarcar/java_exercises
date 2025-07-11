package basic.ex6;

public class DeclaringClassesStudent {
    String name;
    int age;
    int score = 43;
    
    String grade;

    String getGrade() {
        if (score>=90)
            grade = "A";
        else if (score<90 && score>=80)
            grade = "B";
        else if (score<80 && score>=70)
            grade = "C";
        else if (score>=60 && score<70)
            grade = "D";
        else
            grade = "F";
        return grade;
    }



    static int studentCount; {
        studentCount++; }

    void displayInfo() {
        System.out.println(studentCount);
        
        
    }
}