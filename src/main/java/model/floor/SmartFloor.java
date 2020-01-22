package model.floor;

import interfaces.AbstractFactory;
import model.SmartHomeConstants;
import model.factory.FactoryProvider;
import model.room.Room;

import java.util.ArrayList;

public class SmartFloor extends Floor {

    AbstractFactory factory;

    public SmartFloor() {
        onCreate();
    }

    private void onCreate() {
        init();

        factory = FactoryProvider.getFactory(SmartHomeConstants.CLASS_NAME_ROOM_FACTORY);
        roomList.add((Room) factory.create(SmartHomeConstants.CLASS_NAME_SMART_ROOM));
        roomList.add((Room) factory.create(SmartHomeConstants.CLASS_NAME_SMART_ROOM));
        doorList.addAll(roomList.get(0).getDoorList());
        doorList.addAll(roomList.get(1).getDoorList());
    }

    private void init() {
        roomList = new ArrayList<>();
        doorList = new ArrayList<>();
    }
}
