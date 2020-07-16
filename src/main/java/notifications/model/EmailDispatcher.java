package notifications.model;

public class EmailDispatcher {
 private static final String EMAIL_TITLE = "RadioA Notification";
 private Event listenToEvent;
 private EmailProvider provider;
 private InscriptionAdded event;

 public EmailDispatcher(Event event, EmailProvider provider, InscriptionAdded event2) {
  this.listenToEvent = event;
  this.provider = provider;
  this.event = event2;
 }

 public void onInscriptionSendEmail() {
  //TODO: pasar EmailDispacher y no event... 
//  asi desde adentro me invoca al metodo que manda el mail..
  listenToEvent.listenTo(this.event);
//  this.event.received(message)
//  var msg = new InscriptionAdded(listenToEvent.listen()).toMap();
//  System.out.println(msg.get("id"));
//  System.out.println(msg.get("email"));
//   provider.send(m.itemValue(DefaultMessage.EMAIL_ITEM), EMAIL_TITLE,
//     m.itemValue(DefaultMessage.MSG_ITEM));
 }
}
