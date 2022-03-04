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

    //write another method, getDaysInMonth that takes in 2 parameters, month and year int. Return the number of days in the month
    //note that in leap years Feb has 29 days
    //use a switch statement
    // 31 days = January, March, May, July, August, October, December
    //28 or 29 days = February
    // 30 days April, June, Sept, Nov

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int switchValue = month;
        int result = 1;
        switch (switchValue) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            case 2:
                if(isLeapYear(year)) {
                    result = 29;
                } else {
                    result = 28;
                }
                break;
            default:
                result = -1;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1200)); //false
        System.out.println(isLeapYear(1600)); //true
        System.out.println(isLeapYear(1700)); //false
        System.out.println(isLeapYear(1924)); //true
        System.out.println("------------------");
        System.out.println(getDaysInMonth(1, 2022));
        System.out.println(getDaysInMonth(2, 2022));
        System.out.println(getDaysInMonth(2, 1924));

    }

}
