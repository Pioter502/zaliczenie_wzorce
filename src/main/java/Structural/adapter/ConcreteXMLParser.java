package Structural.adapter;

import org.json.JSONObject;
import org.json.XML;

class ConcreteXMLParser implements XMLParser {
    @Override
    public JSONObject parseXML(String xmlData) {

        return XML.toJSONObject(xmlData);
    }
}