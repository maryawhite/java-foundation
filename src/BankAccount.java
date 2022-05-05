public class BankAccount {

    public static int solution(int[] Amount, String[] Date) {
        //how would I separate the transactions by month to determine if there is a fee or not?

        return -1;
    }
}

//you are given a list of all the transactions on a bank account during the year 2020. The account was empty at the beginning of the year (balance = 0)
//each transaction specifies the amount and date it was executed. If the amount is negative, then it was a card payment, otherwise it is an incoming transfer (of at least 0)
//the date of each transaction is in the format YYYY-MM-DD
//there is a fee for having the card. $5 per month, UNLESS: The fee is deducted unless you have at least 3 payments that month, with a total cost of at least 100 that month
//your task is to compute the final balance of the account at the end of 2020.
//write a function public int solution(int[] A, String[] D
//given an array A of N integers representing transaction amounts, returns the final balance of the account at the end of the year 2020
//transaction number k (for K within the range [0...N-1]) was executed on the date represented by D[K] for amount A[K]

//Example: Given A = [100, 100, 100, -10] and D = ["2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"], the function should return 230.
//total income was 100 + 100 + 100 -10 = 290, and the fee was paid every month, so 290 - (5 * 12) = 230.
//assume: N is an integer in the range 1-100, each element of Array A is an integer in the range -1000-1000. D contains Strings in the format YYYY-MM-YY from 01-01-2020 to 12-31-2020