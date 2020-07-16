package notifications.model;

public interface Event {

 void listenTo(OnMessageReceived event);
 
}
