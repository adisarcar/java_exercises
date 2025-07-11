package basic.ex6;

public class Timer {
    int totalTime = 0;
    
    void tick() {
        totalTime +=1;
    }

    void printTime() {
        System.out.println(totalTime + " seconds");
    }

    public static void main (String[]args) {
        Timer t = new Timer();
        t.tick(); t.tick();
        t.printTime(); // Output: 2 seconds
    }
}