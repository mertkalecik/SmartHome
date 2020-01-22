package model;

import model.building.BuildingFactory;
import model.building.SmartBuilding;
import model.door.DoorFactory;
import model.door.SmartDoor;
import model.floor.FloorFactory;
import model.floor.SmartFloor;
import model.light.LightFactory;
import model.light.SmartLight;
import model.room.RoomFactory;
import model.room.SmartRoom;
import model.window.SmartWindow;
import model.window.WindowFactory;

public class SmartHomeConstants {

    //Building
    public static final String CLASS_NAME_BUILDING_FACTORY = BuildingFactory.class.getName();
    public static final String CLASS_NAME_SMART_BUILDING = SmartBuilding.class.getName();


    //Floor
    public static final String CLASS_NAME_FLOOR_FACTORY = FloorFactory.class.getName();
    public static final String CLASS_NAME_SMART_FLOOR = SmartFloor.class.getName();


    //Room
    public static final String CLASS_NAME_ROOM_FACTORY = RoomFactory.class.getName();
    public static final String CLASS_NAME_SMART_ROOM = SmartRoom.class.getName();

    //Door
    public static final String CLASS_NAME_DOOR_FACTORY = DoorFactory.class.getName();
    public static final String CLASS_NAME_SMART_DOOR = SmartDoor.class.getName();

    //Window
    public static final String CLASS_NAME_WINDOW_FACTORY = WindowFactory.class.getName();
    public static final String CLASS_NAME_SMART_WINDOW = SmartWindow.class.getName();

    //Ligt
    public static final String CLASS_NAME_LIGHT_FACTORY = LightFactory.class.getName();
    public static final String CLASS_NAME_SMART_LIGHT = SmartLight.class.getName();

}
