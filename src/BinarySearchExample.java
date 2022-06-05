public class BinarySearchExample {

    public static boolean binarySearchRecursive(int[] arr, int x, int left, int right) {
        if(left > right) {
            return false;
        }

        int mid = (left + right) / 2;  //find the mid point
        ///Note that this may cause an overflow arrow If the middle index is generated simply by getting the middle index (int mid = (low + high) / 2), an overflow may occur for an array containing 230 or more elements as the sum of low + high could easily exceed the maximum positive int value.
        if(arr[mid] == x) {
            return true;  //if we found the element
        } else if (x < arr[mid]) {  //if x is on the left, search the left side
            return binarySearchRecursive(arr, x, left, mid -1);
        } else {
            //otherwise, search the right side
            return binarySearchRecursive(arr, x, mid + 1, right);

        }

    }

    public static boolean binarySearchRecursive(int[] arr, int x) {
        return binarySearchRecursive(arr, x, 0, arr.length -1);
    }


    //Iterative
    public static boolean binarySearchIterative(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        // loop as long as left is less than right
        while(left <= right) {
            int mid = left + ((right - left) / 2);
            if(arr[mid] == x) {
                return true;
            } else if (x < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] myIntArr = {2, 5, 8, 9, 11, 14, 17, 19, 20, 23, 44, 66, 87, 99};
        System.out.println(binarySearchRecursive(myIntArr, 14));  //true
        System.out.println(binarySearchIterative(myIntArr, 14));  //true
    }
}

//binary search: must use a sorted array. Cut it in half, search the left side, then search the right side
//The Big O notation for binary search is logarithmic O(log n)
