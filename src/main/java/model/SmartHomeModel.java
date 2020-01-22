package model;

import event.*;
import interfaces.AbstractFactory;
import interfaces.IEvent;
import manager.EventManager;
import model.building.Building;
import model.factory.FactoryProvider;
import redis.ChannelPublish;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SmartHomeModel {
    AbstractFactory factory;
    ChannelPublish publisher;
    Random random;
    private List<IEvent> eventList;

    public SmartHomeModel() {
        onCreate();
    }

    private void onCreate() {
        assert factory != null;
        factory = FactoryProvider.getFactory(SmartHomeConstants.CLASS_NAME_BUILDING_FACTORY);
        Building building = (Building) factory.create(SmartHomeConstants.CLASS_NAME_SMART_BUILDING);
        initEventList();
    }

    private void initEventList() {
        eventList = new ArrayList<>();
        String initialValue = "close";
        eventList.add(new BlindEvent(initialValue));
        eventList.add(new DoorEvent(initialValue));
        eventList.add(new HeatEvent(initialValue));
        eventList.add(new LightEvent(initialValue));
        eventList.add(new WindowEvent(initialValue));
        eventList.add(new GlassBreakEvent());
        eventList.add(new PresenceEvent());
        eventList.add(new SmokeEvent());
        eventList.add(new WaterEvent());
    }

    public IEvent generateRandomEvent() {
        if (random == null)
            random = new Random();

        String action = "";
        int index = ((random.nextInt()) % 8) + 1;
        if (index < 0)
            index = 0;

        IEvent e = eventList.get(index);

        if (index < 5) {
            if (index % 2 == 0)
                action = "open";
            else
                action = "close";
            e.setAction(action);
        }
        return e;
    }

    public void newEvent(IEvent event) {
        publisher.publish(event.getChannel(), event.getAction());
    }

}
