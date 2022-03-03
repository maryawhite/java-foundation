public class SumChecker {
    //write a method that takes in 3 parameters
    //the method should return a boolean
    //return true if the sum of the first and second number equals the 3rd number

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if(num1 + num2 == num3){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));  //false
        System.out.println(hasEqualSum(1, 1, 2));  //true
        System.out.println(hasEqualSum(1, -1, 0));  //true
        System.out.println(hasEqualSum(5, 5, 10));  //true
    }
}
