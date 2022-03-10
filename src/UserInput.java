import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year");
        //check to see if they entered a number
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();   //to clear out the queue

            int age = 2022 - yearOfBirth;
            //check for a valid age between 0 & 115
            if(age >= 0 && age <= 115){
                System.out.println("age " + age);
            } else {
                System.out.println("Invalid year of birth");
            }

            System.out.println("Enter an integer");
            int userInteger = scanner.nextInt();
            System.out.println("Your number is " + userInteger);

            System.out.println("Enter the width of a rectangle");
            int width = scanner.nextInt();
            System.out.println("Enter the length of a rectangle");
            int length = scanner.nextInt();
            System.out.println("The area of a rectangle is length x width: " + width + " x " + length + " = " + width*length);

            System.out.println("What type of car do you drive?");
            String userinput = scanner.next();
            System.out.println("You entered " + userinput);
        } else {
            System.out.println("please enter a valid year");
        }
        scanner.close();
    }
}
