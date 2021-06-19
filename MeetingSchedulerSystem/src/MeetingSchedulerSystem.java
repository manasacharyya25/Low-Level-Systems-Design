import java.util.ArrayList;
import java.util.List;

public class MeetingSchedulerSystem {
    private List<Room> rooms;

    public MeetingSchedulerSystem() {
        this.rooms = new ArrayList<Room>();

        for (int i = 0; i < 10; i++) {
            this.rooms.add(new Room());
        }
    }

    public Meeting scheduleMeeting(int startTime, int endTime) {
        for (Room r : this.rooms) {
            if (r.getBookedUntil() <= startTime) {
                return new Meeting(startTime, endTime, r.getRoomId());
            }
        }

        return null;
    }

    public void endMeeting(Meeting meeting) {
        for (Room r : this.rooms) {
            if (r.getRoomId() == meeting.getBookedRoomId()) {
                r.freeRoom();
            }
        }
    }
}
