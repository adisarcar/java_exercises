package basic.ex6;

public class MessageRepeater {
    void repeat(String message, int repeatTimes) {
        while (repeatTimes > 0) {
            System.out.print(message + " ");
            repeatTimes -= 1; 
        }
    }
    public static void main (String[]args) {
        MessageRepeater mr = new MessageRepeater();
        mr.repeat("Hello", 3); // Output: Hello Hello Hello
    }

}