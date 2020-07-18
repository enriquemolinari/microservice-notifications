package notifications.model;

public class EmailDispatcher implements OnMessageReceived {
 private static final String EMAIL_TITLE = "RadioA Notification";
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
  var msg = new InscriptionAdded(message).toMap(); 
  System.out.println("sending email to... " + msg.get("email"));
  this.provider.send(msg.get("email"), EMAIL_TITLE, "body...");
 }
}
