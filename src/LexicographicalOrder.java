import java.util.Arrays;

public class LexicographicalOrder {
    //split it into substrings of length k first
    //then use compareTo to determine the lexicographical order

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //split the string, then sort it
        String substring = s.substring(0, k);
        smallest = substring;
        largest = substring;

        for (int i = 1; i <= s.length() - k; i++) {
            // Create a substring of length 'k'
            substring = s.substring(i, i + k);

            // If current substring is lexicographically smaller than 'smallest'
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            // If current substring is lexicographically larger than 'largest'
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
        System.out.println(getSmallestAndLargest("javatowelcome", 3));
        System.out.println(getSmallestAndLargest("pineapplepie", 3));
    }

}

//given a String s and an integer k, complete the function so that it finds the lexicographically smallest
// and largest substring of length k
//sample: welcometojava 3 would return ava and wel
