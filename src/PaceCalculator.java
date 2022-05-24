import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

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

    public static float convertFractionOfAMinute(int seconds) {
        return (float) seconds / 60;
    }
    //distance = time/pace
    //you run 3.1 miles in 28 minutes and 32 seconds. First, convert 32 seconds into a fraction of a minute (32 divided by 60 = .53 minutes). Added to 28 minutes = 28.53 minutes.
    //
    //28.53 minutes / 3.1 miles = 9.20 minutes per mile


    public static String calculatePace(int minutes, int seconds, float distance) {
        //first convert seconds to a fraction of a minute
        //then add it to minutes
        float answer;
        float fraction = convertFractionOfAMinute(seconds);
        float time = minutes + fraction;
//        System.out.println("line 44 min + fraction " + time);
        answer = time/distance;
        String finalPace = DecimalFormat.getNumberInstance().format(answer);
        String formatted = new DecimalFormat("#0.00").format(answer);

//        System.out.println("line 49 time/distance " + answer);

        //need to split it into a string so we can separate minutes and seconds...But only if there is a . (only if there are minutes and seconds. What if it's only seconds)
        String[] strToSplit = formatted.split("\\.");
//        System.out.println("split[0] " + strToSplit[0]);
//        System.out.println("split[1] " + strToSplit[1]);
        //convert back to a float
        int min = Integer.parseInt(strToSplit[0]);
        float sec = Float.parseFloat(strToSplit[1]);  //.20*60
        float convertSec = (sec/100) * 60;
        String formatConvertSec = new DecimalFormat("#").format(convertSec);
        //write an if statement so something like 6:3 shows up as 6:03.
        if(formatConvertSec.length() <= 1) {
            formatConvertSec = "0" + formatConvertSec;
        }
//        System.out.println("*********************");
//        System.out.println(min + ":" + formatConvertSec);

        //https://docs.oracle.com/javase/tutorial/i18n/format/decimalFormat.html
        Locale currentLocale = Locale.getDefault();
        DecimalFormatSymbols colonSymbol = new DecimalFormatSymbols(currentLocale);
        colonSymbol.setDecimalSeparator(':');
//        unusualSymbols.setGroupingSeparator(':');
        String strange = "##0.00";
        DecimalFormat colonFormatter = new DecimalFormat(strange, colonSymbol);
//        weirdFormatter.setGroupingSize(4);
//        String withColon = colonFormatter.format(answer);
//        String withColon = colonFormatter.format(convertSec);
//        System.out.println("with colon " + withColon);


//        return "your pace " + finalPace + " per mile, formatted " + formatted + " with colon " + withColon;
        return "your pace " + min + ":" + formatConvertSec + " per mile";

    }

    public static float calculateDistance(float time, float pace) {
        //user must enter their time and pace as a decimal, i.e 21.5, 7.5 for 21:30, 7:30.
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
//        System.out.println(convertFractionOfAMinute(32));

//        System.out.println(calculatePace(28, 32, 3.107F));  // 9:11
//        System.out.println(calculatePace(18, 45, 3.1F));  // 6:03
//        System.out.println(calculatePace(21, 32, 3.1F));  // 6:57
//        System.out.println(calculatePace(24, 0, 3.1F));  //7:45
//        System.out.println(calculatePace(42, 30, 6.2F));  //6:51
//        System.out.println(calculatePace(37, 30, 5F));  // 7:30
//        System.out.println(calculatePace(12, 0, 1F));  // 12:00
//        System.out.println(calculatePace(12, 0, .5F));  //24:00
//        System.out.println(calculatePace(16, 0, 2F));  //8:00
//        System.out.println(calculatePace(5, 0, 2F));   //2:30
//        System.out.println(calculatePace(5, 0, 3F)); // 1:40/mile
//        System.out.println(calculatePace(1, 0, 4F)); // 0:15
//        System.out.println(calculatePace(0, 60, .25F)); // 4:00
//        System.out.println(calculatePace(60, 60, 7F)); // 8:43
//        System.out.println(calculatePace(120, 60, 7F)); // 17:17

        System.out.println(calculateDistance(21.5F, 7.5F));


        //https://docs.oracle.com/javase/tutorial/i18n/format/decimalFormat.html
//        Locale currentLocale = Locale.getDefault();
//        DecimalFormatSymbols unusualSymbols = new DecimalFormatSymbols(currentLocale);
//        unusualSymbols.setDecimalSeparator(':');
////        unusualSymbols.setGroupingSeparator(':');
//
//        String strange = "##0.##";
//        DecimalFormat weirdFormatter = new DecimalFormat(strange, unusualSymbols);
////        weirdFormatter.setGroupingSize(4);
//        String bizarre = weirdFormatter.format(12.67899999999);
//        System.out.println(bizarre);
    }

}
