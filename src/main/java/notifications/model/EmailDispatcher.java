package notifications.model;

import notifications.model.ports.EmailProvider;
import notifications.model.ports.Event;
import notifications.model.ports.OnMessageReceived;

public class EmailDispatcher implements OnMessageReceived {
 private Event listenToEvent;
 private EmailProvider provider;

 public EmailDispatcher(Event event, EmailProvider provider) {
  this.listenToEvent = event;
  this.provider = provider;
 }

 public void startListening() {
  listenToEvent.listenTo(this);
 }

 @Override
 public void messageReceived(String message) {
  var msg = new InscriptionAdded(message); 
  this.provider.send(msg.email(), msg.title(), msg.body());
 }
}
