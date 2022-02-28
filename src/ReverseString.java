public class ReverseString {

    public static String loopReverseString(String input){
        //strings are immutable, make a new string
        // check for null inputs
        if (input == null) {
            System.out.println("that's null, please enter a word");
            return input;
        }
        String output = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
        return output;
    }

    public static String reverseUsingSB(String input){
        if (input == null) {
            System.out.println("that's null, enter a word");
            return null;
        }

        StringBuilder output = new StringBuilder(input).reverse();
        System.out.println(output.toString());
        return output.toString();
    }

    public static void main(String[] args) {
        loopReverseString("Mary");
        loopReverseString(null);
        reverseUsingSB("time");
    }
}
