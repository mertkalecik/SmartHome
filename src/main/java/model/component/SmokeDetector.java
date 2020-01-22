package model.component;

import event.SmokeEvent;
import manager.EventManager;
import model.alarm.Alarm;

import java.util.Observable;
import java.util.Observer;

public class SmokeDetector implements Observer {

    public SmokeDetector() {
        EventManager.getInstance().addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof SmokeEvent) {
            Alarm.getInstance().onAlarmEventReceived((SmokeEvent) arg);
        }
    }
}
