public class StrictlyIncreasing {

    public static boolean isStrictlyIncreasing(int[] sequence) {
        boolean answer = true;
        for(int i = 0; i < sequence.length; i++) {
            if(sequence[i] < (sequence[i] + 1)) {
                System.out.println(sequence[i + 1]);
                answer = true;
            } else if(sequence[i] < (sequence[i + 2])) {
                System.out.println(sequence[i + 2]);
                answer = true;
            } else {
                answer = false;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        int[] numArr = {1, 3, 2, 1};
        int[] numArr2 = {1, 3, 2};
        System.out.println(isStrictlyIncreasing(numArr));  //false
        System.out.println(isStrictlyIncreasing(numArr2)); //

    }

}

//Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing
// sequence by removing no more than one element from the array.
//[1, 3, 2, 1] should return false bc you can't remove any number to get it to be in increasing order
//[1,3,2] should return true because you can remove one number to get it to be in increasing order
