public class Loops {

    public static void printALoop(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("this will print 5 statements. i = " + i);
        }
    }

    //using a for loop, calculate interest with the amount of 10000 and interest rate of 2,3,4,5,6,7,8
    //print the results to a console window
    public static void calculateInterest(double amount, double highestInterestRate) {
        for (int i = 2; i <= highestInterestRate; i++) {
            System.out.println(amount * i / 100);
        }
    }

    public static void calculateInterestBackwards(double amount, double highestInterestRate) {
        for (int i = 8; i >= 2; i--) {
            System.out.println("backwards " + amount * i / 100);
        }
    }

    //a prime number is a number that can only be divided by itself and 1 without remainders
    public static boolean isPrime (int n) {
        // 0 is not prime
        if(n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //using the statement above, create a for loop, if the number is prime, print it out, and increment a counter,
    // end when the counter gets to 4 no matter what parameter they entered
    //start at any number you want i.e. you don't have to start with i = 1
    public static void printPrimeNumbers(int maxRange){
        int counter = 0;
        for (int i = 0; i < maxRange; i++) {
            if(isPrime(i)){
                System.out.println("i = " + i);
                counter++;
                if (counter == 4){
                    break;
                }
            }

        }
    }

    //increment by 2s
    public static void printByTwos(int max) {
        for (int i = 0; i < max; i+=2){
            System.out.println("i = " + i);
        }
    }

    //sum 3 & 5 challenge
    //write a for loop from 1-1000 inclusive
    //sum all the numbers that can be divided by both 3 & 5, print those numbers
    //break out of the loop once you've found 5 numbers that meet the condition
    //print the sum
    public static void print3And5Challenge(int range){
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= range; i++){
            if(i % 5 == 0 && i % 3 == 0){
                count++;
                sum += i;
                System.out.println(i);
            }
            if(count == 5) {
                break;
            }
        }
        System.out.println("sum is " + sum);
    }

    //write a method that takes in 1 parameter int, and returns a boolean
    //if number is odd return true, otherwise return false
    public static boolean isOdd(int number){
        if (number < 0) {
            return false;
        }
        if (number % 2 == 1){ //if the number is odd return true
            return true;
        } else {
            return false;
        }
    }

    //write a 2nd method that uses isOdd(), that takes in 2 parameters start and end and return the sum of the odd numbers
    //if the starting number is bigger than the ending number, or if either parameter is negative, return -1
    public static int sumOdd(int start, int end) {
        if(start > end || start < 0 || end < 0){
            System.out.println("start is greater than end");
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++){
            if(isOdd(i)){
                System.out.println("i = " + i);
                sum += i;
            }
        }
        System.out.println("sum is " + sum);
        return sum;
    }



    public static void main(String[] args) {
//        printALoop(5);
//
//        calculateInterest(10000, 8);
//        calculateInterestBackwards(10000, 8);
//
//        printPrimeNumbers(100);

//        printByTwos(20);
//        print3And5Challenge(500);
        System.out.println(sumOdd(1, 5));
        System.out.println(sumOdd(10, 5));

    }
}
