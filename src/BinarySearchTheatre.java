import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//we'll implement Comparable in the inner class so we can use Binary Search

public class BinarySearchTheatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>(); //Or you could use a LinkedList instead of ArrayList

    //constructor with additional parameters
    public BinarySearchTheatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        //think of the outer loop as rows and the inner loop as seats
        for(char row = 'A'; row <= lastRow; row++) {  ///row++ is what changes it from A to B to C, etc. (also a char can be a number. A is 65)
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                BinarySearchTheatre.Seat seat = new BinarySearchTheatre.Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    //getter
    public String getTheatreName() {
        return theatreName;
    }

    //method to reserve a seat
    public boolean reserveSeat(String seatNumber) {
        BinarySearchTheatre.Seat requestSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestSeat, null);
        if(foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    //method to get seats
    public void getSeats() {
        for(BinarySearchTheatre.Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    //inner class
    private class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        //constructor for inner class
        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        //override the compareTo
        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        //method
        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        //cancel
        public boolean cancel() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        //get seat Number
        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
