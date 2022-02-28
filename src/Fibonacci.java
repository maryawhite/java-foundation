

public class Fibonacci {

    //method 1 start by printing 0 and 1 then use a for loop
    static void fibonacciMethod1(int number) {
        if (number < 0) {
            System.out.println("please enter a positive number");
        }

        if (number > 0){
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

    }

    //method 2 using recursion
    static int fibonacciMethod2(int number) {
        if(number == 0) {
            return 0;
        }
        if(number == 1 || number == 2) {
            return 1;
        }
        return fibonacciMethod2(number - 2) + fibonacciMethod2(number - 1);
    }

    public static void main(String[] args) {
        fibonacciMethod1(-1);
        fibonacciMethod1(2);

//        for(int i = 0; i < 10; i++){
//            System.out.print(FibonacciMethod2(i) + " ");
//        }

    }
}
