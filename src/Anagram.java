import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        //check to see if the 2 strings are different length
        if(a.length() != b.length()) {
            return false;
        }
        //maybe sort the strings and then see if they are equal
        char[] aCharArr = a.toCharArray();
        char[] bCharArr = b.toCharArray();

        Arrays.sort(aCharArr);
        Arrays.sort(bCharArr);

        if(Arrays.equals(aCharArr, bCharArr)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(isAnagram("cat", "act"));  //true
//        System.out.println(isAnagram("car", "bar"));  //false
        System.out.println(isAnagramNoArrays("cat", "act"));  //true
        System.out.println(isAnagramNoArrays("Cat", "act"));  //true
        System.out.println(isAnagramNoArrays("car", "bar"));  //false
    }


    public static boolean isAnagramNoArrays(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }
        boolean isAnagram = false;
        //change everything to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] arr = a.toCharArray();
        StringBuilder temp = new StringBuilder(b);
        for(char ch : arr) {
            System.out.println("ch " + ch);
            int index = temp.indexOf("" + ch);
            System.out.println("line 45" + temp.indexOf("" + ch));
            if(index != -1) {    //if no value exists, -1 is returned, so this is saying if the character exists, delete it.
                temp.deleteCharAt(index);
            }
        }
        isAnagram = temp.toString().isEmpty();
        return isAnagram;
    }

    //helper class to sort a String alphabetically
//    public static char[] sortString(String a) {
//        char[] arr = a.toCharArray();
//        char temp;
//        int i = 0;
//        while(i <= arr.length) {
//            int j = i + 1;
//            while(j <= arr.length) {
//                if(arr[j] < arr[i]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//                j += 1;
//            }
//            i += 1;
//        }
//        return arr;
//    }
}


//from HackerRank
//given 2 strings, return true or false whether they are anagrams
//2 words are anagrams if they have the same letters in a different order like act and cat