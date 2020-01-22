package event;

import interfaces.IEvent;

public class WindowEvent implements IEvent {

    private String action;

    public WindowEvent(String action) {
        this.action = action;
    }

    @Override
    public void invoke() {

    }

    @Override
    public String getChannel() {
        return "window";
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
