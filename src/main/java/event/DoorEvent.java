package event;

import interfaces.IEvent;

public class DoorEvent implements IEvent {

    private String action;

    public DoorEvent(String action) {
        this.action = action;
    }

    @Override
    public void invoke() {

    }

    @Override
    public String getChannel() {
        return "door";
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public void setAction(String action) {
        this.action = action;
    }
}
