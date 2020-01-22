package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class ChannelPublish {

    public ChannelPublish() {
    }

    public void publish(String channel, String message) {
        Jedis jedis  = null;

        try {
            /* Creating Jedis object for connecting with redis server */
            jedis = new Jedis();

            /* Publishing message to channel C1 */
            jedis.publish(channel, message);

        } catch(Exception ex) {

            System.out.println("Exception : " + ex.getMessage());
        } finally {

            if(jedis != null) {
                jedis.close();
            }
        }
    }
}
