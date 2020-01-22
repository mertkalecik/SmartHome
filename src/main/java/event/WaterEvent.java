package event;

import interfaces.IEvent;

public class WaterEvent implements IEvent {

    @Override
    public void invoke() {

    }

    @Override
    public String getChannel() {
        return "water";
    }

    @Override
    public String getAction() {
        return "water flood is detected...";
    }

    @Override
    public void setAction(String action) {

    }
}
