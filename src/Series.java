import java.util.Scanner;

public class Series {
    //from HackerRank
    //You are given series q in the form of a, b, n. for each query, print the series corresponding to the given a, b, n values
    //as a single line of n space-separated integers
    //(a + 2^0 * b), (a + 2^0 * b + 2^1 * b)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer for the number of queries, a, b, and n. i.e. 2, 0, 2, 10");

        int t = scanner.nextInt();

        for(int i = 0; i < t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("n = " + n);

            //System.out.print((a + (int) Math.pow(2,i) * b) * n);

            //try a nested loop
            //why do we need a nested loop? Bc the first way I tried it, it didn't account for n. So here we're running the loop n number of times
            //and the power is still going up each time
            for (int j = 0; j < n; j++) {
                a += (Math.pow(2,j) * b);
                System.out.print(a + " ");  //remember to use print instead of println
            }
            System.out.println();
        }
        scanner.close();
    }
}
