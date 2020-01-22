package model.window;

import interfaces.ISmartHomeItem;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractWindow implements ISmartHomeItem {
    protected List<WindowSensor> windowSensors;
    protected WindowActuator windowActuator;
    protected List<Blind> blinds;

    public AbstractWindow() {
        this.windowSensors = new ArrayList<>();
        this.blinds = new ArrayList<>();
        windowActuator = new WindowActuator();
        windowSensors.add(new WindowSensor(true));
        blinds.add(new Blind(false));
    }

    public void addDoorSensor(WindowSensor sensor) {
        windowSensors.add(sensor);
    }

    public boolean isClosed(int index) {
        return windowSensors.get(0).isClosed();
    }

    public void openWindow() {
        windowActuator.openWindow();
    }

    public void closeWindow() {
        windowActuator.closeWindow();
    }


}
