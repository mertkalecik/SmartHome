package model.door;

import event.DoorEvent;
import manager.EventManager;

import java.util.Observable;
import java.util.Observer;

public class SmartDoor extends Door implements Observer {
    private DoorOpener doorOpener;
    private DoorSensor doorSensor;

    public SmartDoor()
    {
        doorOpener = new DoorOpener();
        doorSensor = new DoorSensor(true);
        EventManager.getInstance().addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof DoorEvent) {
           if (((DoorEvent) arg).getAction() == "close") {
                doorOpener.closeDoor();
                doorSensor.setClosed(true);
           } else {
               doorOpener.openDoor();
               doorSensor.setClosed(false);
           }
        }
    }
}
