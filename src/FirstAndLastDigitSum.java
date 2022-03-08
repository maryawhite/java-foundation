public class FirstAndLastDigitSum {
    //write a method that takes in 1 int number
    //if the number is negative return -1 to indicate invalid
    //257 should return 9 because 2 + 7 = 9

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0;
        int lastDigit = 0;

        if(number < 0) {
            return -1;
        }

        lastDigit = number % 10;

        while(number != 0) {
            //get the last digit. i.e. number is 257--first loop you get 7, 2nd loop you get 5, 3rd loop you get 2
            firstDigit = number % 10;
            //then divide by 10 to get rid of that last digit. i.e. number is 257--first loop 257/10 = 25, 2nd 25/10 = 2.5, 3rd 2/10 = 0 (its .2 but since we're using integer its 0), and then the loop won't run anymore because the number is now 0
            number = number / 10;
        }
        System.out.println("first + last = " + (firstDigit + lastDigit));
        return firstDigit + lastDigit;

    }

//    public static int sumDigits(int number){
//        if(number < 10){
//            return -1;
//        }
//        int sum = 0;
//        //to get the last digit (least significant digit) 125 -> 125 /10 = 12 -> 12 * 10 = 120 -> 125-120=5
//        while(number > 0){
//            //extract the least significant digit using number % 10
//            int digit = number % 10;
//            //add digit to sum
//            sum += digit;
//            //drop the least significant digit by dividing by 10
//            number /= 10;
//        }
//        return sum;
//    }

    //write a method that takes in 1 parameter int number and returns the sum of the even digits within that number
    //if the number is negative, return -1

    public static int getEvenDigitSum(int number) {
        if(number < 0){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            int digit = number % 10;

            if(digit % 2 == 0){
                sum += digit;
//                number /= 10;  //this does not belong here, it goes outside the if block
            }
            number /= 10;   //remove the last number

        }
         return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println("----------------------------");

        System.out.println(getEvenDigitSum(252));  //2 + 2 = 4
        System.out.println(getEvenDigitSum(2000));  //2 + 2 = 4
    }
}
