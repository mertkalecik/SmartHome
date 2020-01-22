package model.door;

import interfaces.ISmartHomeItem;

import java.util.ArrayList;
import java.util.List;

public abstract class Door implements ISmartHomeItem {
    protected List<DoorSensor> doorSensors;
    protected DoorOpener doorOpener;

    public Door() {
        this.doorSensors = new ArrayList<>();
        doorOpener = new DoorOpener();
        doorSensors.add(new DoorSensor(true));
    }

    public void addDoorSensor(DoorSensor sensor) {
        doorSensors.add(sensor);
    }

    public boolean isClosed(int index) {
        return doorSensors.get(0).isClosed();
    }

    public void openDoor() {
        doorOpener.openDoor();
    }

    public void closeDoor() {
        doorOpener.closeDoor();
    }
}
