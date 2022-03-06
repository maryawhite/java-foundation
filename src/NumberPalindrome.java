public class NumberPalindrome {
    //write a method that takes in one int number and returns a boolean
    //return true if the number is a palindrome, otherwise false
    //tip declare and initialize a variable to store the reverse of a number
    //write a method that takes in 1 int parameter and returns a boolean
    //return true if the number is a palindrome, otherwise return false
    //tips: declare a variable to store the reverse of a number
    //to extract the last digit use lastDigit = number % 10
    //increase the place value of reverse by 1 by multiplying the reverse * 10. i.e. reverse = reverse * 10
    //add lastDigit to reverse, and remove the last digit of number by dividing the number by 10
    //repeat until the number is not equal to (or greater than) zero.

    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int originalNumber = number;
        int reverse = 0;

        while(number > 0) {
            //extract the last digit
            int lastDigit = number % 10;
            //increase the place value of reverse
            reverse = reverse * 10;
            //add lastDigit to reverse
            reverse = reverse + lastDigit;
            //remove last digit of number
            number = number / 10;
            System.out.println("original number line 26 " + originalNumber);
            System.out.println("number line 27 " + number);
            System.out.println("reverse line 28 " + reverse);
        }
        if(reverse == originalNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome(121));
//        System.out.println(isPalindrome(234));
        System.out.println(isPalindrome(-444));
    }
}
