package basic.ex6;

public class CandyJar {
    int totalCandies;

    public CandyJar(int totalCandies) {
        this.totalCandies =  totalCandies;
    }
        
    int getCandiesLeft() {
        return totalCandies;
    }

    void takeOne() {
        totalCandies -= 1;
    }

    void addCandy (int count) {
        totalCandies += count;
    }

    public static void main (String [] args) {
        CandyJar jar = new CandyJar(5);
        jar.takeOne();
        System.out.println(jar.getCandiesLeft()); // Output: 4
    }
        
}