package notifications.infrastructure;

import notifications.model.InscriptionAdded;
import redis.clients.jedis.JedisPubSub;

public class MessageReceived extends JedisPubSub {

 private InscriptionAdded event;
 
 public MessageReceived(InscriptionAdded event) {
  this.event = event;
 }
 
 @Override
 public void onMessage(String channel, String message) {
  System.out.println("aaaaaaaaaaaa" + message);
  this.event.received(message);
 }
}
