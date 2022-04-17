import java.util.HashMap;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();

        languages.put("Python", "an interpreted, object-oriented, high level programming language");
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the list.");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully.");
        }
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners all purpose symbolic instruction code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println("languages: " + languages);

        //keys are unique. using put with the same key will re-write the old value
        //use contains to see if the map already contains that key
        //you can also use putifabsent. That will add only if the key is not present, but doesn't help with null
        System.out.println("-------------------");
        //you can remove items from a map too
//        languages.remove("Lisp");
        //or remove a key if it's mapped to a certain value. remove is a boolean
        if(languages.remove("Algo", "a family of algorithmic languages.")) {
            System.out.println("Algo removed");
        } else {
            System.out.println("Algo not removed, key/value pair not found");
        }

        //you can use replace
        if(languages.replace("Lisp", "this will not work-this would be the old value", "a functional programming language with imperative features.")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced.");
        }

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key)); //get returns the value for that key
        }





    }
}
