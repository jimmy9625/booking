package utils;

import org.json.JSONObject;

public class GenerateBodyRequestPartialUpdate {

    public static String WhitData(String name, String lastname){
        JSONObject body= new JSONObject();

        body.put("firstname",name);
        body.put("lastname",lastname);

        return body.toString();
    }
}
