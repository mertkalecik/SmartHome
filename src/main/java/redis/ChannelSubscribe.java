package redis;

import event.*;
import manager.EventManager;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class ChannelSubscribe {
    public static void main(String[] args) {

        Jedis jedis = null;

        EventManager manager;

        try {

            /* Creating Jedis object for connecting with redis server */
            jedis = new Jedis();

            //manager = new EventManager(new ArrayList<>()).getInstance();
            manager = EventManager.getInstance();

            /* Creating JedisPubSub object for subscribing with channels */
            JedisPubSub jedisPubSub = new JedisPubSub() {

                @Override
                public void onMessage(String channel, String message) {
                    switch (channel) {
                        case "window":
                            manager.onLogEventReceived(new LogEvent("Message arrived to Channel: " + channel + "Action: " + message));
                            break;
                        case "light":
                            manager.onLogEventReceived(new LogEvent("Message arrived to Channel: " + channel + "Action: " + message));
                            break;
                        case "blind":
                            manager.onLogEventReceived(new LogEvent("Message arrived to Channel: " + channel + "Action: " + message));
                            break;
                        case "heat":
                            manager.onLogEventReceived(new LogEvent("Message arrived to Channel: " + channel + "Action: " + message));
                            break;
                        case "door":
                            manager.onLogEventReceived(new LogEvent("Message arrived to Channel: " + channel + "Action: " + message));
                            break;
                        default:
                            break;
                    }

                    //manager.onEventReceived(new BlindEvent());
                }

                @Override
                public void onSubscribe(String channel, int subscribedChannels) {
                    System.out.println("Client is Subscribed to channel : "+ channel);
                }

                @Override
                public void onUnsubscribe(String channel, int subscribedChannels) {
                    System.out.println("Client is Unsubscribed from channel : "+ channel);
                }

            };

            /* Subscribing to channels */
            jedis.subscribe(jedisPubSub, "blind", "light", "heat", "door", "window");

        } catch(Exception ex) {

            System.out.println("Exception : " + ex.getMessage());
        } finally {

            if(jedis != null) {
                jedis.close();
            }
        }
    }
}
