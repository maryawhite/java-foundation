import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
//        int[] a = {4, 5, 1};
//        System.out.println(a[3]); //this will throw an Array Index Out of Bounds Exception

//        try{
//            int[] a = {4, 5, 1};
//            System.out.println(a[3]);  // in this example, the exception will not print to the console
//        } catch(Exception e) {
//            assert System.out != null;
//            System.out.println("An exception has occurred");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your favorite number?");

//        int userInput = scanner.nextInt();
//        System.out.println(userInput);  // if the user enters something that's not a number, an input mismatch exception will be thrown

        try{
            int userInput = scanner.nextInt();
            System.out.println(userInput);
        } catch (Exception e) {
            System.out.println("Error: You didn't enter a number");
        }

//        int[] b = null;
//        System.out.println(b[1]); //this will throw a Null Pointer Exception

        //You can also use multiple catches
        try{
            int[] b = null;
            System.out.println(b[1]);
        } catch (NullPointerException e) {
            System.out.println("Error: Your array is Null.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Your index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Something else went wrong.");
        }
    }
}
//Alex Lee https://www.youtube.com/watch?v=ceGnVDrMy1A
