package basic.ex6;

public class Dice {
    int result;

    int roll () {
        int result = (int)((Math.random()*6)+1);
        this.result = result;
        return result;
    }

    boolean isDouble (Dice otherDice) {
        if (result == otherDice.result)
            return true;
        else
            return false;
    }

    public static void main (String[]args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        d1.roll();
        d2.roll();
        System.out.println(d1.isDouble(d2));
    }
}