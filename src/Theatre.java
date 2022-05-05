import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>(); //Or you could use a LinkedList instead of ArrayList

    //constructor with additional parameters
    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        //think of the outer loop as rows and the inner loop as seats
        for(char row = 'A'; row <= lastRow; row++) {  ///row++ is what changes it from A to B to C, etc. (also a char can be a number. A is 65)
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
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
        Seat requestSeat = null;
        for(Seat seat : seats) {
            System.out.print(".");  //so we can see what's happening. We'll see a "brute force" search. It looks through each seat until it finds the one we're looking for.
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestSeat = seat;
                break;
            }
        }
        if(requestSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestSeat.reserve();
    }

    //method to get seats
    public void getSeats() {
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    //inner class
    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        //constructor for inner class
        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
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
