public class NumberInWord {
    //write a method that takes an int and prints out the word, use 0 through 9
    //use a switch case

    public static void printNumberInWord(int number) {
        int switchValue = number;
        switch (switchValue) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static void main(String[] args) {
        printNumberInWord(1);
        printNumberInWord(9);
        printNumberInWord(0);
    }
}
