package main;

import java.util.Objects;

import notifications.infrastructure.EmailVendorProvider;
import notifications.infrastructure.RedisSubscriber;
import notifications.model.EmailDispatcher;

public class Main {

 public static void main(String[] args) {
  String pubsub = Objects
    .requireNonNullElse(System.getProperty("pub-sub-server"), "localhost");

  String pubsubPort = Objects
    .requireNonNullElse(System.getProperty("pub-sub-port"), "6379");

  new EmailDispatcher(
    new RedisSubscriber(pubsub, Integer.valueOf(pubsubPort)),
    new EmailVendorProvider())
  .startListening();
 }
}
