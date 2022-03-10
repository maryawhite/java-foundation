public class LargestPrime {

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

    public static void printPrimeNumbers(int maxRange){
        int counter = 0;
        for (int i = 0; i < maxRange; i++) {
            if(isPrime(i)){
                System.out.println("i = " + i);
                counter++;
                if (counter == 101){
                    break;
                }
            }

        }
    }

    //Write a method named getLargestPrime with one parameter of type int named number.
    //If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
    //The method should calculate the largest prime factor of a given number and return it.
    //
    //EXAMPLE INPUT/OUTPUT:
    //* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
    //* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
    //* getLargestPrime (0); should return -1 since 0 does not have any prime numbers
    //* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
    //* getLargestPrime (-1); should return -1 since the parameter is negative
    //
    //HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

    public static int getLargestPrime(int number) {
        if(number <= 1) {
            return -1;
        }
        int i;
        int copy = number;
        for(i = 2; i <= copy; i++){
            if(copy % i == 0) {
                copy /= i;
                i--;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
    }
}
