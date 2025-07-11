package basic.ex6;

public class StepCounter {
    int totalSteps = 0;
    int goal;
    boolean goalReached = false;

    void setGoal(int Goal) {
        goal = Goal;
    }

    boolean hasReachedGoal() {
        if (totalSteps>=goal) {
            goalReached = true;
        }
        return goalReached;
    } 

    void addSteps(int steps) {
        totalSteps += steps;
    }
    public static void main (String[]args) {
        StepCounter sc = new StepCounter();
        sc.setGoal(12000);
        sc.addSteps(3000);
        sc.addSteps(7500);
        System.out.println(sc.hasReachedGoal());
    }
} 