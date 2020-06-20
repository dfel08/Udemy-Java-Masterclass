package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        getDurationString(63, 30);
        getDurationString(3675);
    }

    public static String getDurationString (int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            int newMinutes = minutes % 60;
            System.out.println(hours + "h " + newMinutes + "m " + seconds + "s");
            return (hours + "h " + newMinutes + "m " + seconds + "s");
        } else {
            System.out.println("Invalid value");
            return "Invalid Value";
        }
    }

    public static String getDurationString (int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int newSeconds = seconds % 60;
            return getDurationString(minutes, newSeconds);
        } else {
            System.out.println("Invalid value");
            return "Invalid Value";
        }
    }
}
