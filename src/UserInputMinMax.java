import java.util.Scanner;

public class UserInputMinMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int counter = 0;
        int min = 0;
        int max = 0;
        boolean first = true;

        while(counter < 5){
            System.out.println("Enter a number: ");

            boolean isAnInt = scanner.hasNextInt();  //test for valid number

            if(isAnInt) {
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

                counter++;
            } else {
                counter++;
            }
        }
        scanner.nextLine(); //clear out the scanner
        scanner.close();
        System.out.println("max number is " + max);
        System.out.println("min number is " + min);
    }

}
