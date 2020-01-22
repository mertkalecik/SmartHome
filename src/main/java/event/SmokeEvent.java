package event;

import interfaces.IEvent;

public class SmokeEvent implements IEvent {
    @Override
    public void invoke() {

    }

    @Override
    public String getChannel() {
        return "smoke";
    }

    @Override
    public String getAction() {
        return "Smoke is detected...";
    }

    @Override
    public void setAction(String action) {

    }
}
