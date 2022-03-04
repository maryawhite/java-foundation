public class Equality {
    //write a method that takes in 3 parameters of type int
    // if one of the parameters is less than 0 print Invalid Value
    // if all 3 are equal print "All numbers are equal"
    // if all numbers are different print "All numbers are different"
    // otherwise print "Neither all are equal or different.

    public static boolean checkForNegative(int number){
        return number < 0;
    }

    public static void printEqual(int num1, int num2, int num3) {
        if (checkForNegative(num1) || checkForNegative(num2) || checkForNegative(num3)) {
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num1 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    //same solution without the helper method
    //    public static void printEqual(int num1, int num2, int num3) {
    //        if (num1 < 0 || num2 < 0 || num3 < 0) {
    //            System.out.println("Invalid Value");
    //        } else if (num1 == num2 && num1 == num3) {
    //            System.out.println("All numbers are equal");
    //        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
    //            System.out.println("All numbers are different");
    //        } else {
    //            System.out.println("Neither all are equal or different");
    //        }
    //    }

    public static void main(String[] args) {
        printEqual(1, 1, 1);  //equal
        printEqual(1, 1, 2); //neither
        printEqual(-1, -1, -1); //invalid
        printEqual(1, 2, 3);  //different
    }
}
