package model.room;

import model.door.Door;
import model.heating.Heating;
import interfaces.AbstractFactory;
import interfaces.ISmartHomeItem;
import model.light.Light;
import model.window.AbstractWindow;

import java.util.List;

public abstract class Room implements ISmartHomeItem {
    protected List<Door> doorList;
    protected List<AbstractWindow> windowList;
    protected List<Light> lightList;
    protected Heating heating;
    protected AbstractFactory factory;


    public Room() {

    }

    public List<Door> getDoorList() {
        return doorList;
    }

    public void setDoorList(List<Door> doorList) {
        this.doorList = doorList;
    }

    public List<AbstractWindow> getWindowList() {
        return windowList;
    }

    public void setWindowList(List<AbstractWindow> windowList) {
        this.windowList = windowList;
    }

    public List<Light> getLightList() {
        return lightList;
    }

    public void setLightList(List<Light> lightList) {
        this.lightList = lightList;
    }

    public Heating getHeating() {
        return heating;
    }

    public void setHeating(Heating heating) {
        this.heating = heating;
    }

    public AbstractFactory getFactory() {
        return factory;
    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }
}
