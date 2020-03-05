public class secondsInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int secondsOfDay = 86400; // 60 sec * 60 min * 24 h
        int secondsGone = (currentHours*3600)+(currentMinutes*60)+(currentSeconds);

        int secondsLeft = secondsOfDay-secondsGone;

        System.out.println("Seconds so far past: " + secondsGone);
        System.out.println("So many seconds are left for today: " + secondsLeft);
    }
}
