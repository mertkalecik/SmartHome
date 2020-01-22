package model.light;

import interfaces.ISmartHomeItem;

import java.util.ArrayList;
import java.util.List;

public abstract class Light implements ISmartHomeItem {
    protected List<LightSwitch> lightSwitches;
    protected Dimmer dimmer;

    public Light() {
        this.lightSwitches = new ArrayList<>();
        dimmer = new Dimmer();
        lightSwitches.add(new LightSwitch(true));
    }

    public void addSwith(LightSwitch lightSwitch) {
        lightSwitches.add(lightSwitch);
    }

    public boolean isClosed(int index) {
        return lightSwitches.get(0).isClosed();
    }

    public void openLight() {
        dimmer.openLight();
        lightSwitches.get(0).setClosed(false);
    }

    public void closeLight() {
        dimmer.closeLight();
        lightSwitches.get(0).setClosed(true);
    }
}
