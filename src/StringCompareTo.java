public class StringCompareTo {
    //the compareTo method compares 2 strings
    //it returns 0 if the strings are equal
    //it returns < 0 (negative) if the string object precedes the argument
    //it returns > 0 (positive) if the string follows the object

    //there's also a method called compareToIgnoreCase();



    public static void main(String[] args) {

        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Idaho";
        String myStr4 = "Joker";
        String myStr5 = "Zebra";
        String myStr6 = "Hellos";

        String ignoreCase1 = "Goodbye";
        String ignoreCase2 = "goodbye";


        System.out.println(myStr1.compareTo(myStr2)); //should return 0 bc they're equal
        System.out.println(myStr1.compareTo(myStr3)); // -1
        System.out.println(myStr1.compareTo(myStr4));  // -2
        System.out.println(myStr1.compareTo(myStr5));  // -18  (there are 18 letters between H and Z. It's counting Unicode values) it's negative because myStr5 is after myStr1
        System.out.println(myStr5.compareTo(myStr1));  // 18  it's positive bc myStr 1 is before myStr5
        System.out.println(myStr1.compareTo(myStr6));  //-1 "Hellos is 1 more than Hello.
        System.out.println("----------------------");

        System.out.println(ignoreCase1.compareTo(ignoreCase2));           // -32
        System.out.println(ignoreCase1.compareToIgnoreCase(ignoreCase2)); // 0
    }
}
