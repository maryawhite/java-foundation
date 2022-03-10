public class GreatestCommonDivisor {

    //write a method that takes in 2 parameters int
    //if one of the parameters is < 10, return -1
    //the greatest common divisor is the largest possible integer that can fully divide each of the integers (without leaving a remainder)
    //i.e. 12 and 30.
    // 12 can be divided by 1, 2, 3, 4, 6, 12
    // 30 can be divided  by 1, 2, 3, 5, 6, 10, 15, 30
    //the greatest common divisor is 6
    //hint use a while loop or for loop. find the minimum of the 2 numbers

    public static int getGreatestCommonDivisor(int num1, int num2) {
        int gcd = 1;
        if(num1 < 10 || num2 < 10) {
            return -1;
        }
        for(int i = 1; i <= num1 && i <= num2; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int greatestCommonDivisorWhile(int x, int y) {
        if(x < 10 || y < 10) {
            return -1;
        }
        while(x != y){
            if(x > y) {
                x = x - y;
                System.out.println("x " + x);
                System.out.println("y " + y);
            } else {
                y = y - x;
            }
        }
        return y;
    }


    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 10));  //2
        System.out.println(getGreatestCommonDivisor(12, 30));  //6

        System.out.println("----------");
        System.out.println(greatestCommonDivisorWhile(12, 10));
        System.out.println(greatestCommonDivisorWhile(12, 30));
    }
}
