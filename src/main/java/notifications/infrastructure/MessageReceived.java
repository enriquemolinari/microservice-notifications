package notifications.infrastructure;

import notifications.model.OnMessageReceived;
import redis.clients.jedis.JedisPubSub;

public class MessageReceived extends JedisPubSub {

 private OnMessageReceived message;
 
 public MessageReceived(OnMessageReceived event) {
  this.message = event;
 }
 
 @Override
 public void onMessage(String channel, String message) {
  this.message.received(message);
 }
}
