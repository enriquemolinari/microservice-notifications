package notifications.model;

import java.util.Map;

import com.google.gson.Gson;

public class InscriptionAdded {
// private String msgAsJson; 

// public InscriptionAdded(String json) {
//  this.msgAsJson = json;
// }

 public Map<String, String> received(String message) {
  return this.toMap(message);
 }

 private Map<String, String> toMap(String msgAsJson) {
  var gson = new Gson();
  return gson.fromJson(msgAsJson, Map.class);
 }

}
