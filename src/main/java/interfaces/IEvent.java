package interfaces;

public interface IEvent {
    void invoke();
    String getChannel();
    String getAction();
    void setAction(String action);
}
