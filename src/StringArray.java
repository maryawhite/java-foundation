import java.util.ArrayList;

public class StringArray {
    public static void calculateStrLength(ArrayList<String> input) {
        for(String i : input) {
            System.out.println(i.length());
        }
    }

    public static void main(String[] args) {
//        String[] myStrArr = {"Mary", "Two", "dinosaur"};  //4, 3, 8
        ArrayList<String> myStrArr = new ArrayList<>();
        myStrArr.add("Mary");
        myStrArr.add("Two");
        myStrArr.add("Dinosaur");
        calculateStrLength(myStrArr);  //4 3 8
    }
}

//* Write a routine that prints the total length of the Strings in a String[] passed as a parameter.
// Your routine must work unchanged if the parameter is changed to an ArrayList<String>.*/
