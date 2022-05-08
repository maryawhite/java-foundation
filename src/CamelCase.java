import java.util.Arrays;

public class CamelCase {

    static String toCamelCase(String s){
        //given a string like the-stealth-warrior or the_stealth_warrior
        //remove the dashes and change the next letter to uppercase
        //maybe split the word at the dash or underscore
        //then how would I capitalize the first letter of each word.
        //then concatenate the first letter into a single string

        String[] splitStr = s.split("[- |_]");
        String newString = "";
        for(int i = 0; i < splitStr.length; i++) {
            newString += splitStr[i].substring(0, 1).toUpperCase() + splitStr[i].substring(1);
        }

        return newString;
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));

        //Need to fix this so the very first letter is not capitalized
    }

}

//from CodeWars
//write a method that converts dashes/underscores to camelCase
//the-stealth-warrior would be theStealthWarrior
