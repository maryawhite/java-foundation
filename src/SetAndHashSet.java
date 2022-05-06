import java.util.HashSet;
import java.util.Set;

public abstract class SetAndHashSet {
    private final String name;
    private final double orbitalPeriod;
    private final Set<SetAndHashSet> satellites;
    private final BodyTypes bodyType;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    //constructor
    public SetAndHashSet(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    //getters
    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    //get body type
    public BodyTypes getBodyType() {
        return bodyType;
    }

    //method to add a moon
    public boolean addMoon(SetAndHashSet moon) {
        return this.satellites.add(moon);
    }

    //method to add satellites
    public boolean addSatellite(SetAndHashSet moon) {
        return this.satellites.add(moon);
    }

    //getter for satellites
    public Set<SetAndHashSet> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    //when using Sets you should override the equals method
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is: " + obj.getClass());
        System.out.println("this.getClass() is: " + this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((SetAndHashSet) obj).getName();
        return this.name.equals(objName);
    }

    //and override the hashcode method
    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }
}

//from Udemy Jave Masterclass Tim Buchalka
