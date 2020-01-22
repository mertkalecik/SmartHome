package interfaces;

public interface IEventManager {
    void invoke(int index);
    void dispose();
    void onEventReceived(IEvent event);
    void register(IEvent event);
    void onLogEventReceived(IEvent event);
    void onAlarmEventReceived(IEvent event);
}
