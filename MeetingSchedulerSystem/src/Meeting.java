public class Meeting {
    private static int count = 0;
    private int id;
    private int startTime;
    private int endTime;
    private int roomId;

    public Meeting(int startTime, int endTime, int roomId) {
        count += 1;
        this.id = count;
        this.startTime = startTime;
        this.endTime = endTime;
        this.roomId = roomId;
    }

    public int getBookedRoomId() {
        return this.roomId;
    }
}