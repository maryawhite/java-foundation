import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiples {
    //from HackerRank
    //given an integer N, print its first 10 multiples N x i

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            //we want to print N * i until we get to 10 in the format N * i = result
            //either print statement below will work
//            System.out.println(N + " x " + i + " = " + N * i);
            int result = N * i;
            System.out.printf("%d x %d = %d%n", N, i, result);

        }

        bufferedReader.close();
    }
}
