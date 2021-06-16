package src.models;

public class Seat {
    private static int counter;
    private int seatNumber;
    private boolean isBooked;

    static {
        counter = 0;
    }

    public Seat(boolean isBooked) {
        Seat.counter += 1;
        this.seatNumber = Seat.counter;
        this.isBooked = isBooked;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public boolean getIsBooked() {
        return this.isBooked;
    }

    public void setSeatStatus(boolean bookedStatus) {
        this.isBooked = bookedStatus;
    }
}
