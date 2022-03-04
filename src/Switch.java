public class Switch {

    //write a method with 1 parameter int day
    public static void printDayOfTheWeek(int day) {
        int switchValue = day;
        switch(switchValue) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }


    public static void main(String[] args) {
        // if else statement:
        int value = 1;
        if(value == 1){
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value wasn't 1 or 2");
        }


        // switch statement:
        int switchValue = 1;

        switch(switchValue) {
            //if switchValue == 1, 1 is what we want to test for, then after the colon, what we want to do if that's the case
            case 1:
                System.out.println("Value was one.");
                break;

            case 2:
                System.out.println("Value was two.");
                break;

                //the final statement, like else, is the default keyword
            default:
                System.out.println("Was not one or two.");
                break;
        }


        //create a switch statement using char, testing for A, B, C, D or E
        //display a message if any of these are found, or a default message if not found
        char myChar = 'B';

        switch(myChar) {
            case 'A', 'a':
                System.out.println("There is an A");
                break;
            case 'B', 'b':
                System.out.println("There is a B");
                break;
            case 'C', 'c':
                System.out.println("There is a C");
            case 'D', 'd':
                System.out.println("There is a D");
            case 'E', 'e':
                System.out.println("There is an E");
            default:
                System.out.println("Sorry, that letter was not found");
        }


        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(7);
    }




}
