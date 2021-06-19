package BasicRideSharingApp.src;

import java.util.ArrayList;
import java.util.List;

import BasicRideSharingApp.src.models.Driver;
import BasicRideSharingApp.src.models.Ride;

public class RideSharingApp {
    private static List<Driver> drivers;

    public RideSharingApp() {
        drivers = new ArrayList<Driver>();
    }

    public void addDriver(String name) {
        drivers.add(new Driver(name));
    }

    public static Ride createRide(int riderId, int origin, int dest, int numOfSeats) {
        for (Driver d : drivers) {
            if (d.isAvailable()) {
                d.setIsCurrentlyRiding(false);
                return new Ride(origin, dest, numOfSeats, riderId, d.getDriverId());
            }
        }

        return null;
    }

    public static void closeRide(Ride ride) {
        int driverId = ride.getDriverId();

        for (Driver d : drivers) {
            if (d.getDriverId() == driverId) {
                d.setIsCurrentlyRiding(false);
            }
        }
    }

}
