package br.edu.unifei.ecoi09.starwars.json;


import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;

public class JsonReader {

    private String convertInputStreamToString(InputStream is) {
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader br;
            String lineInputStream;
            br = new BufferedReader(new InputStreamReader(is));
            while ((lineInputStream = br.readLine()) != null) {
                buffer.append(lineInputStream);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

    public JSONObject parseJSON(String jsonContent) {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {
            jsonObject = (JSONObject) parser.parse(jsonContent);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }


}
