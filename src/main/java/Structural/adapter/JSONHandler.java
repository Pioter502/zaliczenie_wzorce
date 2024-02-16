package Structural.adapter;

import org.json.JSONObject;

class JSONHandler {
    public void handleJSON(JSONObject jsonData) {

        System.out.println("Handling JSON data: " + jsonData.toString(2));
    }
}