import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        //add numbers to the HashSet. This will create the squares of 1-50 and the cubes of 1-50
        for (int i = 1; i <= 50; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");
        //How many elements would you expect there to be in union? You might expect 100 because there are 50 squares and 50 cubes,
        // but some of the numbers are the same

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);  //retains the elements in this set that are contained in the specified collection

        System.out.println("Intersection contains " + intersection.size() + " elements."); //size will show us how many

        //print out the elements that are in common:
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }


        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        //assymetric difference
        //note that these 2 sets (nature-divine & divine-nature) do not contain the same elements. The output is the words that are different between the 2 strings.
        System.out.println("nature - divine: ");
        Set<String> diff1 = new HashSet<>(nature);  //init with the nature set
        diff1.removeAll(divine);
        printSet(diff1);   //"all", "nature", "but", "art", "unknown", "thee"

        System.out.println("divine - nature: ");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);    //"err", "human", "forgive", "divine"

        //symmetric difference
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference");  //this one combines all the words except the ones in common.
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);  //"all", "nature", "but", "art", "unknown", "thee", "err", "human", "forgive", "divine"


        if(nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        }

        if(nature.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of nature");
        }

        if(divine.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of divine");
        }

    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();

    }

}
//Udemy Tim Buchalka Java Masterclass
