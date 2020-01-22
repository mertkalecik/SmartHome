package event;

import interfaces.IEvent;

public class BlindEvent implements IEvent {
    private String action;

    public BlindEvent(String action) {
        this.action = action;
    }

    @Override
    public void invoke() {

    }

    @Override
    public String getChannel() {
        return "blind";
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
