import event.*;
import interfaces.IEvent;
import manager.EventManager;
import model.SmartHomeModel;
import java.util.List;

public class Application {
    private static EventManager manager;

    public static void main(String[] args) throws InterruptedException {


        SmartHomeModel model = new SmartHomeModel();
        manager = EventManager.getInstance();

        manager.onLogEventReceived(new LogEvent("Welcome to Smart Home Simulation..."));
        manager.onLogEventReceived(new LogEvent("Simulaton is started..."));

        int counter = 10;
        while (true) {
            if (counter > 0) {
                manager.onEventReceived(model.generateRandomEvent());
                Thread.sleep(5000);
                manager.onEventReceived(model.generateRandomEvent());
                counter--;
                Thread.sleep(3000);
            } else
                break;
        }

        manager.onLogEventReceived(new LogEvent("Smart Home Application is closed..."));
    }
}
