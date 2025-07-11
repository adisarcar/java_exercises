package basic.ex6;

public class ParkingMeter {
    int time = 0;

    void addTime(int minutes) {
        time+=minutes;
    }

    void passTime (int minutes) {
        time-=minutes;
        if (time < 0)
            time = 0;
    }

    boolean isExpired() {
        if (time==0)
            return true;
        else
            return false;
    }

    public static void main (String[] args) {
        ParkingMeter pm = new ParkingMeter();
        pm.addTime(30);
        pm.passTime(35);
        System.out.println(pm.isExpired()); // Output: true
    }
}
