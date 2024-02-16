package Structural.adapter;

import org.json.JSONObject;

interface XMLParser {
    JSONObject parseXML(String xmlData);
}