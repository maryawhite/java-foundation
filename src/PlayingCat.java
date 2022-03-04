public class PlayingCat {
    //write a method that takes in 2 parameters, return true if the cat is playing
    //the cat plays if the temperature is between 25 & 35 inclusive, unless it's summer, then the upper limit is 45 inclusive

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer == true && (temperature >= 25 && temperature <= 45)) || (summer == false && (temperature >= 25 && temperature <= 35))) {
            return true;
        } else {
            return false;
        }
    }

    //    public static boolean isCatPlaying(boolean summer, int temperature) {
    //        if (temperature >= 25 && temperature <= 35) {
    //            return true;
    //        }
    //        if (temperature >= 25 && temperature <= 45 && summer == true) {
    //            return true;
    //        } else {
    //            return false;
    //        }
    //    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 40)); //true
        System.out.println(isCatPlaying(false, 30));  //true
        System.out.println(isCatPlaying(true, 50)); //false
        System.out.println(isCatPlaying(false, 45)); //false
    }
}
