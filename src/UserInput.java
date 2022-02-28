import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of car do you drive?");
        String userinput = scanner.next();
        System.out.println("You entered " + userinput);

        System.out.println("Enter an integer");
        int userInteger = scanner.nextInt();
        System.out.println("Your number is " + userInteger);

        System.out.println("Enter the width of a rectangle");
        int width = scanner.nextInt();
        System.out.println("Enter the length of a rectangle");
        int length = scanner.nextInt();
        System.out.println("The area of a rectangle is length x width: " + width + " x " + length + " = " + width*length);
    }
}
