package notifications.infrastructure;

import notifications.model.ports.EmailProvider;

public class EmailVendorProvider implements EmailProvider {

 @Override
 public void send(String emailTo, String emailTitle, String emailBody) {
  // User your best email sender provider
 }
}
