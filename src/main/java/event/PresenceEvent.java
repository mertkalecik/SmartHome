package event;

import interfaces.IEvent;

public class PresenceEvent implements IEvent {

    @Override
    public void invoke() {

    }

    @Override
    public String getChannel() {
        return "presence";
    }

    @Override
    public String getAction() {
        return "Some movement is detected...";
    }

    @Override
    public void setAction(String action) {

    }
}
