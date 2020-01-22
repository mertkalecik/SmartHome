package model.staircase;

import model.room.Room;

public class StairCase {
    private Room lowerRoom;
    private Room upperRoom;

    public StairCase(Room lowerRoom, Room upperRoom) {
        this.lowerRoom = lowerRoom;
        this.upperRoom = upperRoom;
    }

    public Room getLowerRoom() {
        return lowerRoom;
    }

    public void setLowerRoom(Room lowerRoom) {
        this.lowerRoom = lowerRoom;
    }

    public Room getUpperRoom() {
        return upperRoom;
    }

    public void setUpperRoom(Room upperRoom) {
        this.upperRoom = upperRoom;
    }
}
