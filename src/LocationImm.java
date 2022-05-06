import java.util.HashMap;
import java.util.Map;

public final class LocationImm {  ///adding the final keyword to your classes makes it so it can't be subclassed, and makes it immutable
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    //constructor
    public LocationImm(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        //account for if someone enters null into the constructor
        if(exits != null) {
            this.exits = new HashMap<String, Integer>(exits);
        } else {
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }

//    //method to add exits---We don't need this anymore bc we added the map of exits to the constructor
//    public void addExit(String direction, int location) {
//        exits.put(direction, location);   //key:value --> direction:location
//    }

    //getters
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);  //create a new hash map
    }
}
