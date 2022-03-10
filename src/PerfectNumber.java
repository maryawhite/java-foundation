public class PerfectNumber {

    //a perfect number is a positive integer which is equal to the sum of its proper positive divisors
    //proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder AND exclude the perfect number itself
    //i.e. the number 6. It's divisors are 1, 2, 3 (exclude 6 bc that's itself) and 1 + 2 + 3 = 6
    //write a method that takes in 1 int
    //if the parameter is < 1 return false

    public static boolean isPerfectNumber (int number) {
        if(number < 1) {
            return false;
        }
        //find the divisors exclude itself
        //add them up and see if they equal the number
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        if(sum == number) {
            return true;
        } else {
            return false;
        }
    }

//    public static void printFactors(int number) {
//        if (number < 1) {
//            System.out.println("Invalid Value");
//        }
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));
    }
}
