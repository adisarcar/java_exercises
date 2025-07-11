package basic.ex6;

public class ComplexParkingMeter {

    int minutesPerQuarter;
    int maximumTime;
    int timeRemaining = 0;
    int totalQuartersCollected = 0;

    public ComplexParkingMeter(int minutesPerQuarter, int maximumTime) {
        this.minutesPerQuarter = minutesPerQuarter;
        this.maximumTime = maximumTime;
    }

    public void insertCoin (int numOfQuarters) {
        totalQuartersCollected += numOfQuarters;

        timeRemaining += (minutesPerQuarter*numOfQuarters);
        if (timeRemaining>maximumTime)
            timeRemaining = maximumTime;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void passTime (int minutes) {
        timeRemaining -= minutes;

        if (minutes>timeRemaining)
            timeRemaining = 0;
    }

    public double getTotal () {
        double totalMoneyCollected = (0.25 * totalQuartersCollected);
        return (totalMoneyCollected);
    }
}