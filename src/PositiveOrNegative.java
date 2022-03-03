public class PositiveOrNegative {

    //write a static void method that takes in an integer and PRINTS out whether the number is positive, negative or zero.

    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(1);
        checkNumber(-1);
    }
}
