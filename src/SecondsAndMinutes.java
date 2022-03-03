public class SecondsAndMinutes {
    //write a method with 2 parameters minutes and seconds, minutes should be >= 0 and
    // seconds should be >= 0 and <= 59
    // calculate how many hours, minutes, and seconds equals the min and seconds passed. return a string

    public static String getDurationString(long minutes, long seconds) {
        if(minutes < 0) {
            return "Invalid Value";
        }
        if (seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }
        //there are 60 minutes in 1 hour
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        //** BONUS ** how would you add a leading zero to the hours/mins/seconds, i.e. 2h 5m 30s would be 02h 05m 30s
        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }

//        return hours + "h " + remainingMinutes + "m " + seconds + "s";
        return hoursString + " " + minutesString + " " + secondsString;
    }

    // create an overloaded method that only takes in seconds
    // seconds must be >= 0
    // calculate how many minutes are in seconds then call the first method

    public static String getDurationString(long seconds) {
        //there are 60 seconds in 1 minute
        if (seconds < 0) {
            return "Invalid Value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        System.out.println(getDurationString(minutes, remainingSeconds));
        return getDurationString(minutes, remainingSeconds);

    }

    public static void main(String[] args) {
        System.out.println(getDurationString(125, 30)); //2h 5m 30 s
        System.out.println(getDurationString(7530));

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

}
