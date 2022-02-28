

public class Fibonacci {

    //method 1 start by printing 0 and 1 then use a for loop
    static void FibonacciMethod1(int number) {
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2);

        for(int i = 2; i < number; i ++) {
            int n3;
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    //method 2 using recursion
    static int FibonacciMethod2(int number) {
        if(number == 0) {
            return 0;
        }
        if(number == 1 || number == 2) {
            return 1;
        }
        return FibonacciMethod2(number - 2) + FibonacciMethod2(number - 1);
    }

    public static void main(String[] args) {
//        FibonacciMethod1(10);

        for(int i = 0; i < 10; i++){
            System.out.print(FibonacciMethod2(i) + " ");
        }

    }
}
