package notifications.model;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class InscriptionAdded {
 private static final String MSG_BODY = "msg-body";
 private static final String MSG_TITLE = "msg-title";
 private static final String EMAIL_ADDRESS = "email";
 private Map<String, String> map;
 
 public InscriptionAdded(String json) {
  var gson = new Gson();
  this.map = gson.fromJson(json,
    new TypeToken<Map<String, String>>() {
    }.getType());
 }
 
 public String email() {
  return this.map.get(EMAIL_ADDRESS);
 }

 public String title() {
  return this.map.get(MSG_TITLE);
 }
 
 public String body() {
  return this.map.get(MSG_BODY);
 }
}
