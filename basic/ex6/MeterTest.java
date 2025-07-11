package basic.ex6;

public class MeterTest {
    public static void main (String[]args) {
        ComplexParkingMeter cpm = new ComplexParkingMeter(15, 60);
        
        cpm.insertCoin(4);
        cpm.passTime(90);
        
        System.out.println(cpm.getTimeRemaining());
        System.out.println(cpm.getTotal());
    }
}