public class TeensChecker {
    //write a method that takes in 3 parameters of type int
    //if one of the numbers is in the teens (between 13 and 19 inclusive) return true, otherwise return false

//    public static boolean hasTeen(int num1, int num2, int num3){
//        if(num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19 || num3 >= 13 && num3 <= 19) {
//            return true;
//        }
//        return false;
//    }

    //write another method named isTeen with 1 parameter int
    //return true if the number is between 13 and 19 inclusive
    public static boolean isTeen(int num1) {
        if(num1 >= 13 && num1 <= 19) {
            return true;
        } else {
            return false;
        }
    }

    //now re-write the first function to use the second function

    public static boolean hasTeen(int num1, int num2, int num3) {
        if(isTeen(num1) || isTeen(num2) || isTeen(num3)) {
            return true;
        } else {
            return false;
        }
    }


    //write a function that takes in 2 parameters, feet and inches, convert to centimeters and return that value
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0.0) {
            return -1;
        }
        if (inches > 12.0 || inches < 0.0) {
            System.out.println("Invalid Number");
            return -1;
        }

        //1 inch = 2.54 cm
        double feetToInches = feet * 12;
        double totalInches = feetToInches + inches;
        double answer = totalInches * 2.54;
//        System.out.println(feet + " feet " + inches + "inches is " + answer + " cm" );
        return answer;
    }

    //create an overloaded method that takes in 1 parameter, inches, calculate how many feet are in inches, then call the other overloaded method
    //so that it calculates correctly
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches <= 0) {
            System.out.println("Invalid Number");
            return -1;
        } else {
            double quotient = (int) inches / 12;
            double remainder = (int) inches % 12;
            System.out.println(quotient + " feet " + remainder + " inches is " + calcFeetAndInchesToCentimeters(quotient, remainder) + " cm");
            return calcFeetAndInchesToCentimeters(quotient, remainder);
        }

    }



    public static void main(String[] args) {
//        System.out.println(hasTeen(9, 99, 19));
//        System.out.println(hasTeen(23, 15, 42));
//        System.out.println(hasTeen(22, 23, 24));
        System.out.println(calcFeetAndInchesToCentimeters(1, 4));
        System.out.println(calcFeetAndInchesToCentimeters(16));
    }
}
