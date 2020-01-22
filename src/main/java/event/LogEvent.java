package event;

import interfaces.IEvent;

public class LogEvent implements IEvent {

    private String message;

    public LogEvent(String message) {
        this.message = message;
    }

    @Override
    public void invoke() {

    }

    @Override
    public String getChannel() {
        return "";
    }

    @Override
    public String getAction() {
        return message;
    }

    @Override
    public void setAction(String action) {

    }
}
