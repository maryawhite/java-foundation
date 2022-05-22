import java.text.DecimalFormat;

public class PaceCalculator {
    //write a method that will calculate a total time based on pace per mile and distance
    //time in minutes divided by distance in miles
    //input minutes, seconds and distance in miles
    //convert minutes to seconds

    public static long minToSec(int minutes) {
        long answer = 0;
        return answer = minutes * 60L;
    }

    public static long minToSeconds(int minutes, int seconds) {
        long answer = 0;
        return answer = minutes * 60L + seconds;
    }

    public static long minToSecondsAlt(int minutes, int seconds) {
        long totalSeconds = 0;
        return totalSeconds = minToSec(minutes) + seconds;
    }

    public static double convertFractionOfAMinute(int seconds) {
        return (double) seconds / 60;
    }
    //distance = time/pace
    //you run 3.1 miles in 28 minutes and 32 seconds. First, convert 32 seconds into a fraction of a minute (32 divided by 60 = .53 minutes). Added to 28 minutes = 28.53 minutes.
    //
    //28.53 minutes / 3.1 miles = 9.20 minutes per mile

    public static String calculatePace(int minutes, int seconds, double distance) {
        //first convert seconds to a fraction of a minute
        //then add it to minutes
        double answer;
        double fraction = convertFractionOfAMinute(seconds);
        double time = minutes + fraction;
        System.out.println(time);
        answer = time/distance;
        String finalPace = DecimalFormat.getNumberInstance().format(answer);
        String formatted = new DecimalFormat("#.0#").format(answer);

        System.out.println(answer);
        return "your pace " + finalPace + " per mile, formatted " + formatted;
    }

    public static double calculateDistance(double time, double pace) {
        return time/pace;
    }

//    public static String calculateDistance(double time, double pace) {
//        //      System.out.println("double : " + String.format("%.2f", input));
//        double distance;
//        distance = time/pace;
//        return String.format("%2f", distance);
//    }


    public static void main(String[] args) {
//        System.out.println(minToSec(8));   //8:00 = 480 seconds
//        System.out.println(minToSeconds(8, 40));    //8:40 = 520 seconds
//        System.out.println(minToSecondsAlt(8, 40));    //8:40 = 520 seconds
        System.out.println(calculatePace(28, 32, 3.1));
        System.out.println("distance " + calculateDistance(28.53, 9.20));
        System.out.println("distance " + calculateDistance(30, 10.00));

    }

}
