package resources;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReUsableMethods {
    public static String rawToJason(Response response, String key){
        String logResponse = response.asString();
        JsonPath js = new JsonPath(logResponse);
        return js.get(key).toString();
    }
}
