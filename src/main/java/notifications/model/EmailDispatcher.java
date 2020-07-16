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
 public void received(String message) {
  var msg = new InscriptionAdded(message).toMap();
  System.out.println(msg.get("id"));
  System.out.println(msg.get("email"));
 }
}
