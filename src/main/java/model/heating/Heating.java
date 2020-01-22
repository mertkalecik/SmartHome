package model.heating;

import event.HeatEvent;
import manager.EventManager;

import java.util.Observable;
import java.util.Observer;

public class Heating implements Observer {

    private Termostat termostat;

    public Heating() {
        this.termostat = new Termostat(false);
        EventManager.getInstance().addObserver(this);
    }

    public void openHeating() {
        termostat.openTermostat();
    }

    public void closeHeating() {
        termostat.closeTermostat();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof HeatEvent) {
            if (((HeatEvent) arg).getAction() == "open") {
                openHeating();
            } else {
                closeHeating();
            }
        }
    }
}
