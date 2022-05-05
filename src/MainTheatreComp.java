import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTheatreComp {

    public static void main(String[] args) {

        TheatreComp theatre = new TheatreComp("Olympian", 8, 12);

        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay.");
        } else {
            System.out.println("Sorry, seat taken.");
        }
        System.out.println("- - - - - - - -");

        //create a new List of seats, add 2 new seats. then use Collections.sort to sort them passing in the list and the comparator
        List<TheatreComp.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00)); //instantiate the inner class
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, TheatreComp.PRICE_ORDER);
        printList(priceSeats);

    }

    //note this method needs to be outside of the psvm
    public static void printList(List<TheatreComp.Seat> list) {
        for(TheatreComp.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
    }


}
