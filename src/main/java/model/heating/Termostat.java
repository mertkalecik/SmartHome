package model.heating;

public class Termostat {

    private boolean isClosed;

    public Termostat(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public void openTermostat() {
        System.out.println("Termostat is opened");
    }

    public void closeTermostat() {
        System.out.println("Termostat is closed");
    }
}
