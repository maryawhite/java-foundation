public class MainTheatre {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();

        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay.");
        } else {
            System.out.println("Sorry, seat taken.");
        }
        System.out.println("- - - - - - - -");

        BinarySearchTheatre binarySearchTheatre = new BinarySearchTheatre("Atlas", 8, 12);
        if(binarySearchTheatre.reserveSeat("H11")) {
            System.out.println("please pay.");
        } else {
            System.out.println("sorry, seat taken");
        }

    }
}
