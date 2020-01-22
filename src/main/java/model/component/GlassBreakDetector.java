package model.component;

import event.GlassBreakEvent;
import manager.EventManager;
import model.alarm.Alarm;

import java.util.Observable;
import java.util.Observer;

public class GlassBreakDetector implements Observer {

    public GlassBreakDetector() {
        EventManager.getInstance().addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof GlassBreakEvent) {
            Alarm.getInstance().onAlarmEventReceived((GlassBreakEvent) arg);
        }
    }
}
