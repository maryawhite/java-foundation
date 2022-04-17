import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerUsage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int x;
//
//        System.out.println("Enter an integer: ");
//        if(scanner.hasNextInt()) {
//            x = scanner.nextInt();
//            System.out.println("half of x is " + (x / 2));
//        } else {
//            System.out.println("integer was not entered");
//        }

        //test A
        //Read two integers and output maximum using Scanner and no exceptions
        int x, y;
        System.out.println("Enter two integers: ");

        if(scanner.hasNextInt()){
            x = scanner.nextInt();
            if(scanner.hasNextInt()) {
                y = scanner.nextInt();
                System.out.println("Max: " + Math.max(x, y));
                return;
            }
        }
        System.err.println("Error: need two integers.");

        //test B
        //Read 2 integers and output maximum using Scanner and Exceptions
//        System.out.println("Enter 2 integers: ");
//
//        try {
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            System.out.println("Max: " + Math.max(x, y));
//        }
//        catch (NoSuchElementException e) {
//            System.err.println("Error: need two ints");
//        }

        //test C
        //Read two integers from the same line and output maximum using two Scanners
//        System.out.println("Enter 2 integers on one line separated by a space: ");
//        try {
//            String oneLine = scanner.nextLine();   //the scanner reads this whole line
//            Scanner str = new Scanner(oneLine);    //then create a second scanner to extract the 2 integers, but we should really check to make sure there aren't more than 2 integers entered
//
//            int x = str.nextInt();
//            int y = str.nextInt();
//
//            System.out.println("Max: " + Math.max(x, y));
//        }
//        catch (NoSuchElementException e) {
//            System.err.println("Error: need two integers");
//        }

        //test D
        //Read exactly 2 integers from the same line and output maximum using two Scanners
//        System.out.println("Enter 2 integers on one line, separated by a space ");
//        try {
//            String oneLine = scanner.nextLine();
//            Scanner str = new Scanner(oneLine);
//
//            int x = str.nextInt();
//            int y = str.nextInt();
//
//            if(!str.hasNext())
//                System.out.println("max: " + Math.max(x, y));
//            else
//                System.err.println("Error: extraneous data on the line.");
//        } catch (NoSuchElementException e) {
//            System.err.println("Error: need two integers.");
//        }


    }
}
