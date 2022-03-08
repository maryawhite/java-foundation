public class SharedDigit {
    //write a method that takes in 2 parameters int
    //each number should be between 10 and 99 inclusive
    //the method should return true if there is a digit appears in both numbers like 3 appears in 13 and 30, otherwise false
    //tip n/10 gives the left digit, n%10 gives the right digit

    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        int num1left = num1 / 10;
        int num1right = num1 % 10;
        int num2left = num2 / 10;
        int num2right = num2 % 10;

        if (num1left == num2left || num1left == num2right || num1right == num2left || num1right == num2right){
            return true;
        } else {
            return false;
        }
    }

    //write a method with 3 parameters int
    //each number should be in the range of 10-1000 inclusive
    //if 1 of the numbers is not within that range, return false
    //return true if at least 2 of the numbers share the last (rightmost) digit, otherwise
    //i.e. 41, 22, 71 should return true

    //write a helper method named isValid that takes in 1 int and returns true if the number is between 10 & 1000

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int num1Right = num1 % 10;
        int num2Right = num2 % 10;
        int num3Right = num3 % 10;

        if (num1Right == num2Right || num1Right == num3Right || num2Right == num3Right) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }


    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));  //true
        System.out.println(hasSharedDigit(9, 99));  //-1
        System.out.println(hasSharedDigit(15, 55));  //true

        System.out.println("------------------");
        System.out.println(hasSameLastDigit(41, 22, 71));  //true
    }

}
