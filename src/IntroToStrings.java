import java.util.Scanner;

public class IntroToStrings {
    //Hacker Rank
    //give 2 strings, return the sum of their lengths
    //determine if A is lexicographically larger than B (return Yes or No)
    //capitalize the first letter in A and B and print them on a single line separated by a space

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());

        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String[] aArr = A.split("");
        String[] bArr = B.split("");
        System.out.println((aArr[0].toUpperCase() + A.substring(1)) + " " + (bArr[0].toUpperCase() + B.substring(1)));


        //note: when you run the code, type 2 strings without quotes. for example dog cat, will return 6, yes, Dog Cat.
        //it's yes because dog comes after cat alphabetically thus it's larger(positive)
    }
}
