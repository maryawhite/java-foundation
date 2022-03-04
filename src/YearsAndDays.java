public class YearsAndDays {

    public static void printYearsAndDays(long minutes) {
        //convert minutes to yrs and days 365 days in 1 years, 24 hours per day, 60 min per hour
        //8760 hrs/yr
        //525600 min/yr
        //i.e. 525600 min = 1 y and 0 d
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long remainingD = minutes % 525600;  //this is remaining hours, you'll need to divide by 60 to get hours num of hrs in a day, then divide by 24 to get days
            long remainingDays = remainingD / 60 / 24;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }


    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(527040);
        printYearsAndDays(-527040);
    }
}
