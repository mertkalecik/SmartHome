package model.light;

import interfaces.IEvent;

public class Dimmer {

    public Dimmer() {
    }

    public void openLight() {
        System.out.println("Light is opened");
    }

    public void closeLight() {
        System.out.println("Light is closed");
    }

    public void sendLightEvent(IEvent event) {
        //TODO implement...
    }
}
