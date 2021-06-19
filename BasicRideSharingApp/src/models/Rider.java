package BasicRideSharingApp.src.models;

import BasicRideSharingApp.src.RideSharingApp;

public class Rider {
    private static int count = 0;
    private int id;
    private String name;
    private int numOfRides;
    private boolean isPreferredRider;
    private Ride currentRide;

    public Rider(String name) {
        count += 1;
        this.id = count;
        this.name = name;
        this.numOfRides = 0;
        this.isPreferredRider = false;
        this.currentRide = null;
    }

    public boolean createRide(int origin, int dest, int numOfSeats) {
        Ride ride = RideSharingApp.createRide(id, origin, dest, numOfSeats);

        if (ride != null) {
            this.currentRide = ride;
            this.numOfRides += 1;
            return true;
        }

        return false;
    }

    public boolean updateRide(int origin, int dest, int numOfSeats) {
        if (this.currentRide != null) {
            this.currentRide.setOrigin(origin);
            this.currentRide.setDest(dest);
            this.currentRide.setNumOfSeats(numOfSeats);

            return true;
        }

        return false;
    }

    public double closeRide() {
        if (this.currentRide != null) {
            double rideAmount = calculateRideAmount();
            RideSharingApp.closeRide(this.currentRide);
            this.currentRide = null;

            return rideAmount;
        }

        return 0;
    }

    private double calculateRideAmount() {
        int numOfSeats = this.currentRide.getNumOfSeats();
        int rideDistance = this.currentRide.getDistance();

        if (numOfSeats >= 2) {
            return rideDistance * numOfSeats * 20 * (this.isPreferredRider ? 0.5 : 0.75);
        } else
            return rideDistance * 20 * (this.isPreferredRider ? 0.75 : 1);
    }

}
