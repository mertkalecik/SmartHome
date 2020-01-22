package event;

import interfaces.IEvent;

public class HeatEvent implements IEvent {

    private String action;

    public HeatEvent(String action) {
        this.action = action;
    }

    @Override
    public void invoke() {

    }

    @Override
    public String getChannel() {
        return "heat";
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
