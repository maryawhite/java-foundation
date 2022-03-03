public class LeapYear {

    //write a method that takes in one parameter int year
    //the parameter should be between 1 and 9999, if it's outside that range, return false
    //calculate if the year is a leap year and return true or false

    //if the year is evenly divisible by 4, then check to see if it's evenly divisible by 100, if yes, then check to see if it's evenly divisible by 400, if those 3 are true, then it is a leap year


    public static boolean isLeapYear(int year) {
        //if it's outside the range return false
        if (year < 1 || year > 9999) {
            return false;
        }
        //if it's not evenly divisible by 4 return false
        if (year % 4 != 0) {
            return false;
        }

        //if it's evenly divisible by 4 AND not evenly divisible by 100 return true
        if(year % 4 == 0 && year % 100 != 0) {
            return true;
        }

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1200)); //false
        System.out.println(isLeapYear(1600)); //true
        System.out.println(isLeapYear(1700)); //false
        System.out.println(isLeapYear(1924)); //true

    }

}
