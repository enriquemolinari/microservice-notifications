package main;

import notifications.infrastructure.EmailVendorProvider;
import notifications.infrastructure.RedisSubscriber;
import notifications.model.EmailDispatcher;

public class Main {

 public static void main(String[] args) {
  var mail = new EmailDispatcher(new RedisSubscriber("localhost", 6379),
    new EmailVendorProvider());
  mail.startListening();
 }
}
