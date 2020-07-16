package notifications.infrastructure;

import notifications.model.Event;
import notifications.model.InscriptionAdded;
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
 public void listenTo(InscriptionAdded event) {
  try (Jedis jSubscriber = new Jedis()) {
   var a = new MessageReceived(event);
   jSubscriber.subscribe(a, CHANNEL_NAME);
//   System.out.println("NNNNNNNNNNNNN" + a.message());
//   return a.message();
  }
 }
}
