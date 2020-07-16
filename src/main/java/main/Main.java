package main;

import notifications.infrastructure.RedisSubscriber;
import notifications.model.EmailDispatcher;
import notifications.model.InscriptionAdded;

public class Main {

 public static void main(String[] args) {

  var mail = new EmailDispatcher(new RedisSubscriber("localhost", 6379),
    null, new InscriptionAdded());

  mail.onInscriptionSendEmail();

 }
}
