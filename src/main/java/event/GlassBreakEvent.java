package event;

import interfaces.IEvent;

public class GlassBreakEvent implements IEvent {
    @Override
    public void invoke() {

    }

    @Override
    public String getChannel() {
        return "glass-break";
    }

    @Override
    public String getAction() {
        return "Broken Glass detected...";
    }

    @Override
    public void setAction(String action) {

    }
}
