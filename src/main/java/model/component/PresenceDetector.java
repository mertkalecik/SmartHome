package model.component;

import event.GlassBreakEvent;
import event.PresenceEvent;
import manager.EventManager;
import model.alarm.Alarm;

import java.util.Observable;
import java.util.Observer;

public class PresenceDetector implements Observer {

    public PresenceDetector() {
        EventManager.getInstance().addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof PresenceEvent) {
            Alarm.getInstance().onAlarmEventReceived((PresenceEvent) arg);
        }
    }
}
