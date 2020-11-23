package notifications.infrastructure;

import notifications.model.ports.Event;
import notifications.model.ports.OnMessageReceived;
import redis.clients.jedis.Jedis;

public class RedisSubscriber implements Event {

 private String CHANNEL_NAME = "inscription-added";
 private String host;
 private int port;

 public RedisSubscriber(String host, int port) {
  this.host = host;
  this.port = port;
 }

 @Override
 public void listenTo(OnMessageReceived onMessage) {
  try (Jedis jSubscriber = new Jedis(this.host, this.port)) {
   jSubscriber.subscribe(new RedisMessageReceived(onMessage),
     CHANNEL_NAME);
  }
 }
}
