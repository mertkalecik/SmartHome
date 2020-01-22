package model.light;

public class LightSwitch {

    private boolean isClosed;

    public LightSwitch(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}
