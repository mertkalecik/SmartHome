package model.component;

import event.WaterEvent;
import manager.EventManager;
import model.alarm.Alarm;

import java.util.Observable;
import java.util.Observer;

public class WaterDetector implements Observer {

    public WaterDetector() {
        EventManager.getInstance().addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WaterEvent) {
            Alarm.getInstance().onAlarmEventReceived((WaterEvent) arg);
        }
    }
}
