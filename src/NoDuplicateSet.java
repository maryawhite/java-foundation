import java.util.*;

public class NoDuplicateSet {

    public static void hasDuplicates(String[] myArr) {
        Set<String> mySet = new HashSet<String>();

        //maybe iterate over the string array, and add each one to mySet
        for(String str : myArr) {
            if(!mySet.add(str)) {
                System.out.println("This is a duplicate: " + str);
            }
            mySet.add(str);
        }
        System.out.println(mySet.size());
        System.out.println(mySet);
    }

    public static void main(String[] args) {
        String[] arr = {"Mary", "Mary", "had", "had", "a", "a", "little", "lamb"};
        System.out.println(Arrays.toString(arr));

        hasDuplicates(arr);
    }

}
//Ways to find duplicate in an array
/* Set doesn't allow duplicates in Java.
Which means if you have added an element into Set and trying to insert duplicate
element again, it will not be allowed. Note: A set is not in order.
In Java, you can use the HashSet class to solve this problem.
Just loop over array elements, insert them into HashSet using add() method, and check the return value.

If add() returns false it means that element is not allowed in the Set and that is your duplicate.

Read more: https://javarevisited.blogspot.com/2015/06/3-ways-to-find-duplicate-elements-in-array-java.html#ixzz7V518eXlk */

//how would you create a method called hasDuplicates that returns true if there are any duplicates?