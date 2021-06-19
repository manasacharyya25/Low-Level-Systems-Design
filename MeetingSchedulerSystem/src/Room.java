public class Room {
    private static int counter = 0;
    private int id;
    private int bookedUntil;

    public Room() {
        counter += 1;
        this.id = counter;
        this.bookedUntil = 0;
    }

    public int getRoomId() {
        return this.id;
    }

    public int getBookedUntil() {
        return this.bookedUntil;
    }

    public void freeRoom() {
        this.bookedUntil = 0;
    }
}
