package model.light;

import event.LightEvent;
import manager.EventManager;

import java.util.Observable;
import java.util.Observer;

public class SmartLight extends Light implements Observer {
    private Dimmer dimmer;
    private LightSwitch lightSwitch;


    public SmartLight() {
        dimmer = new Dimmer();
        lightSwitch = new LightSwitch(true);
        EventManager.getInstance().addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof LightEvent) {
            if (((LightEvent) arg).getAction() == "close"){
                dimmer.closeLight();
                lightSwitch.setClosed(true);
            } else {
                dimmer.openLight();
                lightSwitch.setClosed(false);
            }
        }
    }
}
