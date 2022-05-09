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
        newString += splitStr[0];

        for(int i = 1; i < splitStr.length; i++) {
            newString += splitStr[i].substring(0, 1).toUpperCase() + splitStr[i].substring(1);
        }

        return newString;
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));  //theStealhWarrior  Note that the first t does not change
        System.out.println(toCamelCase("Mary-had-a"));          //MaryHadA   Note that the first M is capital because it originally was

    }

}

//from CodeWars
//write a method that converts dashes/underscores to camelCase
//the-stealth-warrior would be theStealthWarrior
