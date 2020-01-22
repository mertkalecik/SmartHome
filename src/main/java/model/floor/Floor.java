package model.floor;

import interfaces.ISmartHomeItem;
import model.door.Door;
import model.room.Room;

import java.util.List;

public abstract class Floor implements ISmartHomeItem {
    protected int index;
    protected List<Room> roomList;
    protected List<Door> doorList;

    public Floor() {

    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public List<Door> getDoorList() {
        return doorList;
    }

    public void setDoorList(List<Door> doorList) {
        this.doorList = doorList;
    }
}
