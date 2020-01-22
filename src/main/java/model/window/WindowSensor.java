package model.window;

public class WindowSensor {
    private boolean isClosed;

    public WindowSensor(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public void sendWindowNotClosedEvent() {
        // TODO implement the logic...
    }
}
