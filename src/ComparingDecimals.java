public class ComparingDecimals {
    //write a method that takes 2 parameters of type double
    //the method should return a boolean
    //return true if the 2 double numbers are the same up to 3 decimal places, otherwise return false

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if (num1 == num2) {
            return true;
        }
        //multiply by 1000 to get rid of the decimal and cast to an int to get rid of any numbers after the thousandth place
        int num1thousand = (int) (num1 * 1000);
        int num2thousand = (int) (num2 * 1000);

        if(num1thousand == num2thousand) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756)); //true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));  //false
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.175)); //true
    }
}
