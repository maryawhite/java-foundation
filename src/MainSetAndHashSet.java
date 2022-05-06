import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainSetAndHashSet {
    private static Map<String, SetAndHashSet> solarSystem = new HashMap<>();
    private static Set<SetAndHashSet> planets = new HashSet<>();

    public static void main(String[] args) {

        SetAndHashSet temp = new Planet("Mercury", 88);  //our constructor uses the name and orbital period
        solarSystem.put(temp.getName(), temp);  //key value pair
        planets.add(temp);

        temp = new Planet("Venus", 225);  ///our constructor uses the name and orbital period
        solarSystem.put(temp.getName(), temp);  //key value pair
        planets.add(temp);

        temp = new Planet("Earth", 365);  ///our constructor uses the name and orbital period
        solarSystem.put(temp.getName(), temp);  //key value pair
        planets.add(temp);

        SetAndHashSet tempMoon = new Moon("Moon", 27);
        solarSystem.put(temp.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(SetAndHashSet planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        SetAndHashSet body = solarSystem.get("Jupiter");
        System.out.println("Moons of " + body.getName());
        for(SetAndHashSet jupiterMoon : body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName());
        }

        //addAll method of a Set
        Set<SetAndHashSet> moons = new HashSet<>();
        for(SetAndHashSet planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        //then in order to view the names, we can use an enhanced for loop with the getName method
        System.out.println("All Moons ");
        for(SetAndHashSet moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        SetAndHashSet pluto = new Planet("Pluto", 842);
        planets.add(pluto);

        for(SetAndHashSet planet : planets) {
            //now that we have a toString methods, we can use:
            System.out.println(planet);
//            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }
        //Note that the 2nd Pluto wasn't added to the set, because our equals method is working.
    }
}
//5 rules of the equals method:
