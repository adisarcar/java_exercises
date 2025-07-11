package basic.ex6;

public class ElevatorSimulator  {
    int currentFloor = 1;

    void goUp() {
        currentFloor += 1;
        if (currentFloor>5)
            currentFloor = 5;
    }

    void goDown(int downFloors) {
        currentFloor -= 1;
        if (currentFloor<1)
            currentFloor = 1;
    }
    
    int getCurrentFloor() {
        return currentFloor;
    }

    public static void main (String[]args) {
        ElevatorSimulator e = new ElevatorSimulator();
        e.goUp();
        e.goUp();
        System.out.println(e.getCurrentFloor());
    }

}
