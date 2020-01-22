package model.window;

import event.BlindEvent;
import interfaces.IEvent;
import manager.EventManager;

import java.util.Observable;
import java.util.Observer;

public class Blind implements Observer {
    private boolean isClosed;
    private BlindActuator blindActuator;

    public Blind(boolean isClosed) {
        this.isClosed = isClosed;
        blindActuator = new BlindActuator();
        EventManager.getInstance().addObserver(this);
    }

    public void openBlind() {
        isClosed = false;
        blindActuator.openBlind();
    }

    public void closeBlind() {
        isClosed = true;
        blindActuator.closeBlind();
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }


    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof BlindEvent) {
            closeBlind();
        }
    }
}
