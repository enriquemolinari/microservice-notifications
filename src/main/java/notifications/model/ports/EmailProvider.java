package notifications.model.ports;

public interface EmailProvider {

 void send(String emailTo, String emailTitle, String emailBody);

}
