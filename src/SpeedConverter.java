public class SpeedConverter {

    //convert km/h to mph rounded
    //1 mph is 1.609 kph

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);  //call the method we created earlier
            System.out.println(kilometersPerHour + " km/h= " + milesPerHour + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(10);
        printConversion(10.5);
        printConversion(30);
        printConversion(40);
    }
}
