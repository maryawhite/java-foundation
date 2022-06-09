import java.util.Arrays;

/* ideally this enum would be in a separate class, but for this example we'll put the classes together. */
enum Season {
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);

    //enum can contain variables and constructors
    private int value;

    private Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class EnumsExample {

    //whereever you can use a class to define a type, you could use an enum as well

    public static void main(String[] args) {
        Season autumn = Season.FALL;

        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1);
        System.out.println(season1.name());
        System.out.println("season1 ordinal " + season1.ordinal());  //each value has an ordinal which is like the index
        System.out.println("season1 getValue " + season1.getValue());  //each value has an ordinal which is like the index
        System.out.println(Season.SPRING.ordinal());
        System.out.println(Season.SUMMER.ordinal());
        System.out.println(autumn.ordinal());
        //it's not a good idea to store things based on their ordinal, because the item can be moved which would cause the ordinal to be changed
        System.out.println(autumn);

        System.out.println(Arrays.toString(Season.values()));  //this will print the enum values as an array
    }

}

//an enumeration can restrict the values
