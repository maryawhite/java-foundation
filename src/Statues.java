import java.util.Arrays;

public class Statues {

    public static int countStatues(int[] statues) {
        //sort the original array
        if(statues.length > 0) {
            //The Arrays.sort() method has a return type of void,
            Arrays.sort(statues);

            int count = 0;
            for(int i = 1; i < statues.length; i++) {
                int diff = statues[i] - statues[i-1];
                if(diff > 1) {
                    count += diff -1;
                }
            }
            return count;
        } else {
            return -1;
        }


    }

    public static void main(String[] args) {
        int[] numArr = {6, 2, 3, 8};  // 3 because it's missing 4,5 and 7, that's 3 numbers
        System.out.println(countStatues(numArr));
    }
}

//how many numbers would you need to add to get an array of consecutive numbers
//Codesignal problem

