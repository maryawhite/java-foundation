public class TimeOfDayBoolean {
    //write a method that has 2 parameters, a boolean and hour of day. the hour is an int from 0-23
    //wake up if the dog is barking before 8 or after 22, in that case return true, else return false
    //if the hour is less than 0 or greater than 23, return false

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(hourOfDay > 23){
            return false;
        }
        if (isBarking == true && (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//        System.out.println(shouldWakeUp(true, 5));  //true
//        System.out.println(shouldWakeUp(false, 5));  //false
//        System.out.println(shouldWakeUp(true, 10));  //false
//        System.out.println(shouldWakeUp(false, 10)); //false
        System.out.println(shouldWakeUp(true, 24));
        System.out.println(shouldWakeUp(true, 0));
    }
}



