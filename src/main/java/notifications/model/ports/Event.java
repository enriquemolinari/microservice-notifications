package notifications.model.ports;

public interface Event {

 void listenTo(OnMessageReceived event);
 
}
