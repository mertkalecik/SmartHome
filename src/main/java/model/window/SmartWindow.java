package model.window;

import event.WindowEvent;
import manager.EventManager;

import java.util.Observable;
import java.util.Observer;

public class SmartWindow extends AbstractWindow implements Observer {
    private WindowActuator actuator;
    private WindowSensor sensor;

    public SmartWindow() {
        actuator = new WindowActuator();
        sensor = new WindowSensor(true);
        EventManager.getInstance().addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WindowEvent) {
            if (((WindowEvent) arg).getAction() == "open") {
                actuator.openWindow();
                sensor.setClosed(false);
            } else {
                actuator.closeWindow();
                sensor.setClosed(true);
            }
        }
    }
}
