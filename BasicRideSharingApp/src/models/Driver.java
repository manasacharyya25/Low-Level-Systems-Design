package BasicRideSharingApp.src.models;

public class Driver {
    private static int count = 0;
    private int id;
    private String name;
    private boolean isCurrentlyRiding;

    public Driver(String name) {
        count += 1;
        this.id = count;
        this.name = name;
        this.isCurrentlyRiding = false;
    }

    public int getDriverId() {
        return this.getDriverId();
    }

    public boolean isAvailable() {
        return this.isCurrentlyRiding;
    }

    public void setIsCurrentlyRiding(boolean isCurrentlyRiding) {
        this.isCurrentlyRiding = isCurrentlyRiding;
    }
}
