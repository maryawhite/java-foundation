public class MegabyteConverter {
    //write a method that takes in 1 parameter int kiloBytes
    //the method should not return anything (void)
    //calculate the megabytes and remaining kilobytes from the parameter
    //if the parameter is less than 0, print Invalid Value
    //1 MB = 1024 KB
    //XX KB = YY MB and ZZ KB

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int quotient = kiloBytes / 1024;
            System.out.println("quotient " + quotient);
            int remainder = kiloBytes % 1024;
            System.out.println("remainder " + remainder);
        }
    }

    public static void printMegaBytesAndKiloBytesUdemy(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int quotient = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB= " + quotient + " MB and " + remainder + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        System.out.println("----------------");
        printMegaBytesAndKiloBytesUdemy(2500);
    }
}
