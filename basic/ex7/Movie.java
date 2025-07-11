package basic.ex7;

public class Movie {
    String title;
    float rating;
    int duration;

    boolean isLongMovie() {
        if (duration>120)
            return true;
        else
            return false;
    }
    
}