import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//use with Location class
public class MainLocationImm {
    private static Map<Integer, LocationImm> locations = new HashMap<Integer, LocationImm>();  //make sure this is outside of psvm

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //in the Location class, we set up a constructor that will take in the locationID and description
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new LocationImm(0, "You are sitting in front of a computer learning Java", tempExit));   //if you pass null instead of tempExit, you'll get a nullpointer exception

        //Edit, Find, Replace. Make sure Regex is checked then search for locations.get\(\d\).addExit and replace with tempExit.put

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new LocationImm(1, "You are standing at the end of a road before a small brick building",tempExit));


        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new LocationImm(2, "You are at the top of a hill",tempExit));


        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new LocationImm(3, "You are inside a building, a well house for a small spring",tempExit));


        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new LocationImm(4, "You are in a valley beside a stream",tempExit));


        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new LocationImm(5, "You are in the forest",tempExit));


        //add an option that allows players to type in the full word North, South, East, West
        //create a new hash map
        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");  //these words need to be uppercase
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while(true) {
            //in the Location class, we created the method getDescription
            System.out.println(locations.get(loc).getDescription());  //locations.get() returns the value of whatever key we put in the ()
            //we can keep typing numbers until we type 0, then it will break out of the loop. typing a number outside of 0-5 causes an error
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are: ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();  //we're using the toUpperCase method in case the user types in a lower case letter
            //check the direction, if the length is greater than one, use an enhanced for loop to loop through it and look for one of the keys
            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word: words) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction.");
            }
        }
    }
}
