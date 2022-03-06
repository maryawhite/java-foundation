public class WhileLoops {

    public static void printWhileLoop(){
        int count = 1;
        while (count != 6) {  //this will stop it before it gets to 6, (along with count++). once the count == 6, then the loop breaks
            System.out.println("count is + " + count);
            count++;
        }
    }

    //write a method that takes in 1 parameter, int, if it is an even number return true, otherwise return false
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

    public static void printEvenNumbers(int startNumber, int finishNumber){
        int countEvens = 0;
        while(startNumber <= finishNumber) {
            startNumber++;
            if(!isEvenNumber(startNumber)){   //if it's not an even number, skip it and continue the loop
                continue;
            }
            countEvens++;  //this count needs to be down here, if you put it above the if statement, it counts too many
            System.out.println("Even Number: " + startNumber);
        }
        System.out.println("Count is " + countEvens);

    }

    //the do while loop will run once before checking the condition
    public static void printEvenNumbersDoWhile (int startNumber, int finishNumber){
        do{
            if(!isEvenNumber(startNumber)){
                startNumber++;
                continue;
            }
            System.out.println("Even number: " + startNumber);
            startNumber++;
        } while(startNumber <= finishNumber);
    }

    //write a method that takes in 1 int parameter
    //if the parameter is < 10, return -1
    //otherwise, sum the digits and return their sum. 125 = 1 + 2 + 5 = answer 8

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        //to get the last digit (least significant digit) 125 -> 125 /10 = 12 -> 12 * 10 = 120 -> 125-120=5
        while(number > 0){
            //extract the least significant digit using number % 10
            int digit = number % 10;
            //add digit to sum
            sum += digit;
            //drop the least significant digit by dividing by 10
            number /= 10;
        }
        return sum;
    }

    //write a method that takes in 1 int parameter and returns a boolean
    //return true if the number is a palindrome, otherwise return false
    //tips: declare a variable to store the reverse of a number
    //to extract the last digit use lastDigit = number % 10
    //increase the place value of reverse by 1 by multiplying the reverse * 10. i.e. reverse = reverse * 10
    //add lastDigit to reverse, and remove the last digit of number by dividing the number by 10
    //repeat until the number is not equal to (or greater than) zero.

//    public static boolean isPalindrome(int number){
//        int reverse = 0;
//
//        while(number > 0) {
//            //extract the last digit
//            int lastDigit = number % 10;
//            //increase the place value of reverse
//            reverse = reverse * 10;
//            //add lastDigit to reverse
//            reverse = reverse + lastDigit;
//            //remove last digit of number
//            number = number / 10;
//
//        }
//        if(reverse == number) {
//            return true;
//        } else {
//            return false;
//        }
//    }


    public static void main(String[] args) {
//        printWhileLoop();
//        System.out.println(isEvenNumber(2));  //true
//        System.out.println(isEvenNumber(5));  //false

//        printEvenNumbers(4, 20);
//        System.out.println("------------------------");
//        printEvenNumbersDoWhile(4, 20);

//        System.out.println(sumDigits(125));   //8
//        System.out.println(sumDigits(11));    //2
//        System.out.println(sumDigits(1));     //-1

    }
}
