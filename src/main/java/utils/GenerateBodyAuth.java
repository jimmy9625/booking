package utils;

import org.json.JSONObject;

public class GenerateBodyAuth {

    public static String WhitData(String userName, String password) {
        JSONObject body = new JSONObject();

        body.put("username", userName);
        body.put("password", password);

        return body.toString();
    }
}
