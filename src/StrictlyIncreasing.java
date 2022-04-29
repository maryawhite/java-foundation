public class StrictlyIncreasing {

//    public static boolean isStrictlyIncreasing(int[] sequence) {
//        boolean answer = true;
//        for(int i = 0; i < sequence.length; i++) {
//            if(sequence[i] < (sequence[i] + 1)) {
//                System.out.println(sequence[i + 1]);
//                answer = true;
//            } else if(sequence[i] < (sequence[i + 2])) {
//                System.out.println(sequence[i + 2]);
//                answer = true;
//            } else {
//                answer = false;
//            }
//        }
//        return answer;
//    }

    public static boolean isStrictlyIncreasing(int[] arr) {
        int modify = 0;
        int n = arr.length;

        // Check whether the first element needs
        // to be modify or not
        if (arr[0] > arr[1]) {
            arr[0] = arr[1] / 2;
            modify++;
        }

        // Loop from 2nd element to the 2nd last element
        for (int i = 1; i < n - 1; i++) {

            // Check whether arr[i] needs to be modified
            if ((arr[i - 1] < arr[i] && arr[i + 1] < arr[i])
                    || (arr[i - 1] > arr[i] && arr[i + 1] > arr[i])) {

                // Modifying arr[i]
                arr[i] = (arr[i - 1] + arr[i + 1]) / 2;

                // Check if arr[i] is equal to any of
                // arr[i-1] or arr[i+1]
                if (arr[i] == arr[i - 1] || arr[i] == arr[i + 1])
                    return false;

                modify++;
            }
        }

        // Check whether the last element needs
        // to be modify or not
        if (arr[n - 1] < arr[n - 2])
            modify++;

        // If more than 1 modification is required
        if (modify > 1)
            return false;

        return true;
    }



    public static void main(String[] args) {
        int[] numArr = {1, 3, 2, 1};
        int[] numArr2 = {1, 3, 2};
        int[] numArr3 = {1, 2, 3, 4};
        System.out.println(isStrictlyIncreasing(numArr));  //false
        System.out.println(isStrictlyIncreasing(numArr2)); //true
        System.out.println(isStrictlyIncreasing(numArr3)); //true

    }

}

//Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing
// sequence by removing no more than one element from the array.
//[1, 3, 2, 1] should return false bc you can't remove any number to get it to be in increasing order
//[1,3,2] should return true because you can remove one number to get it to be in increasing order
