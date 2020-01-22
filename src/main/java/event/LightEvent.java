package event;

import interfaces.IEvent;

public class LightEvent implements IEvent {

    private String action;

    public LightEvent(String action) {
        this.action = action;
    }

    @Override
    public void invoke() {

    }

    @Override
    public String getChannel() {
        return "light";
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
