import java.util.Scanner;

public class TryCatchFinallyExample {

    public static void main(String[] args) {
//        int a = 5;
//        int b = 0;
//        int c = a/b;  //this will cause an Arithmetic Exception: divide by zero


//        try {
//            int a = 5;
//            int b = 0;
//            int c = a/b;
//
//        } catch (Exception e) {
//            System.out.println("You should not divide by zero. Catastrophic consequences.");
//        } finally {
//            System.out.println("This is the finally block. Finally always runs. Close your scanner or other things.");
//        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("You entered: " + scanner.next());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }


    }

}

// Alex Lee https://www.youtube.com/watch?v=bLGzEqd-ELM
