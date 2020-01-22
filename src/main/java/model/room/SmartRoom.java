package model.room;

import model.SmartHomeConstants;
import model.door.Door;
import model.factory.FactoryProvider;
import model.heating.Heating;
import model.light.Light;
import model.window.AbstractWindow;

import java.util.ArrayList;

public class SmartRoom extends Room {

    public SmartRoom() {
        onCreate();
    }

    private void onCreate() {
        initialize();

        factory = FactoryProvider.getFactory(SmartHomeConstants.CLASS_NAME_DOOR_FACTORY);
        doorList.add((Door)factory.create(SmartHomeConstants.CLASS_NAME_SMART_DOOR));
        doorList.add((Door)factory.create(SmartHomeConstants.CLASS_NAME_SMART_DOOR));

        factory = FactoryProvider.getFactory(SmartHomeConstants.CLASS_NAME_WINDOW_FACTORY);
        windowList.add((AbstractWindow) factory.create(SmartHomeConstants.CLASS_NAME_SMART_WINDOW));

        factory = FactoryProvider.getFactory(SmartHomeConstants.CLASS_NAME_LIGHT_FACTORY);
        lightList.add((Light) factory.create(SmartHomeConstants.CLASS_NAME_SMART_LIGHT));

        System.out.println("Room Created Successfully... ");
    }

    private void initialize() {
        doorList = new ArrayList<>();
        windowList = new ArrayList<>();
        lightList = new ArrayList<>();
        heating = new Heating();
    }
}
