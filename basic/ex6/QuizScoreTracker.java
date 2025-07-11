package basic.ex6;

public class QuizScoreTracker {
    float totalScore = 0;
    int quizzesTaken = 0;
    float averageTestScore;

    void addScore(int score) {
        totalScore += score;
        quizzesTaken += 1;
    }
    
    float getAverage() {
        averageTestScore = (totalScore)/quizzesTaken;
        if (quizzesTaken==0)
            return 0;
        else
            return averageTestScore;
    }
    
    public static void main (String[]args) {
        QuizScoreTracker tracker = new QuizScoreTracker();
        tracker.addScore(85);
        tracker.addScore(90);
        System.out.println(tracker.getAverage()); // Output: 87.5
    }
}