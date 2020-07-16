package notifications.model;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class InscriptionAdded {
 private String msgAsJson;

 public InscriptionAdded(String json) {
  this.msgAsJson = json;
 }

 public Map<String, String> toMap() {
  var gson = new Gson();
  return gson.fromJson(this.msgAsJson,
    new TypeToken<Map<String, String>>() {
    }.getType());
 }
}
