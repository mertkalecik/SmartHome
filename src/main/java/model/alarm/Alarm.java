package model.alarm;


import interfaces.IEvent;
import manager.EventManager;

public class Alarm {

    private static Alarm instance;


    private Alarm() {

    }

    public static Alarm getInstance() {
        if (instance == null)
            instance = new Alarm();
        return instance;
    }

    public void onAlarmEventReceived(IEvent event) {
        EventManager.getInstance().onAlarmEventReceived(event);
    }


}
