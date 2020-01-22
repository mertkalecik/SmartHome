package manager;

import event.*;
import interfaces.IAlarmEvent;
import interfaces.IEvent;
import interfaces.IEventManager;
import redis.ChannelPublish;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class EventManager extends Observable implements IEventManager {

    private static EventManager eventManager;
    private ChannelPublish publisher;

    private List<IEvent> eventList;

    private EventManager(List<IEvent> eventList) {
        this.eventList = eventList;
        publisher = new ChannelPublish();
    }

    @Override
    public void invoke(int index) {
        eventList.get(index).invoke();
    }

    @Override
    public void dispose() {
        eventList.clear();
    }

    @Override
    public void onEventReceived(IEvent event) {
        eventList.add(event);
        handleEvent(event);
    }


    private void handleEvent(IEvent event) {
        update(event);
        if (event instanceof GlassBreakEvent || event instanceof SmokeEvent || event instanceof PresenceEvent || event instanceof WaterEvent) {
            onAlarmEventReceived(event);
        }
        publisher.publish(event.getChannel(), event.getAction());
        eventList.clear();
    }

    public List<IEvent> getEventList() {
        return eventList;
    }

    @Override
    public void register(IEvent event) {
        eventList.add(event);
    }

    @Override
    public void onLogEventReceived(IEvent event) {
        System.out.println(event.getAction());
    }




    public static EventManager getInstance() {
        if (eventManager == null)
            eventManager = new EventManager(new ArrayList<>());

        return eventManager;
    }

    private void update(IEvent event) {
        if (event != null) {
           setChanged();
           notifyObservers(event);
        }
    }

    @Override
    public void onAlarmEventReceived(IEvent event) {
        onLogEventReceived(new LogEvent("***************************************************************"));
        onLogEventReceived(new LogEvent("Alarm type: " + event.getChannel() +"\n"));

        if (event instanceof PresenceEvent){
            onLogEventReceived(new LogEvent("Police Department is Called..."));
        }

        if (event instanceof GlassBreakEvent) {
            onLogEventReceived(new LogEvent("Mobile phone is calling..."));
        }

        if (event instanceof SmokeEvent) {
            onLogEventReceived(new LogEvent("Fire department is calling..."));
        }
        onLogEventReceived(new LogEvent("***************************************************************"));

    }
}
