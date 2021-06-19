package BasicRideSharingApp.src.models;

public class Ride {
    private int origin;
    private int destination;
    private int numOfSeats;

    private int riderId;
    private int driverId;

    public Ride(int origin, int dest, int numOfSeats, int riderId, int driverId) {
        this.origin = origin;
        this.destination = dest;
        this.numOfSeats = numOfSeats;
        this.riderId = riderId;
        this.driverId = driverId;
    }

    public int getNumOfSeats() {
        return this.numOfSeats;
    }

    public int getDistance() {
        return (this.destination - this.origin);
    }

    public int getRiderId() {
        return this.riderId;
    }

    public int getDriverId() {
        return this.driverId;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public void setDest(int dest) {
        this.destination = dest;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
}
