import java.util.Scanner;

public class DivideByTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;

        System.out.println("Enter an integer: ");
        try{
            String oneLine = scanner.nextLine();
            x = Integer.parseInt(oneLine);
            System.out.println("half of x is " + (x/2));
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}
