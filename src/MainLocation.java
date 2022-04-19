import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//use with Location class
public class MainLocation {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();  //make sure this is outside of psvm

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //in the Location class, we set up a constructor that will take in the locationID and description
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        //add the exits
        //in the Location class, we defined a hashMap called exits and a method called addExit, which takes in a direction and location
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
//        locations.get(1).addExit("Q", 0);               //instead of listing Q multiple times, we can put it in the constructor in the Location class

        locations.get(2).addExit("N", 5);
//        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
//        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
//        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
//        locations.get(5).addExit("Q", 0);

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
