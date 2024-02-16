package Structural.adapter;


public class Main {
    public static void main(String[] args) {

        XMLParser xmlParser = new ConcreteXMLParser();

        XMLToJSONAdapter adapter = new XMLToJSONAdapter(xmlParser);

        String xmlData = "<root><name>Jan</name><age>20</age></root>";

        adapter.convertXMLToJSON(xmlData);
    }
}