package model.door;

public class DoorSensor {
    private boolean isClosed;

    public DoorSensor(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public void sendDoorNotClosedEvent() {
        // TODO implement the logic...
    }
}
