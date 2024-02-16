package Structural.adapter;

import org.json.JSONObject;

class XMLToJSONAdapter extends JSONHandler {
    private final XMLParser xmlParser;

    public XMLToJSONAdapter(XMLParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    public void convertXMLToJSON(String xmlData) {

        JSONObject dataFromXML = xmlParser.parseXML(xmlData);
        handleJSON(dataFromXML);
    }
}