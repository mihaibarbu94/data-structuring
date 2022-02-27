package src;

import src.data.manipulation.ArtmarkDataDecoder;
import src.data.manipulation.DataParser;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("hey");

        DataParser dataParser = new DataParser();
        Map<String, String>  dataMap = dataParser.parse();
        ArtmarkDataDecoder artmarkDataDecoder = new ArtmarkDataDecoder(dataMap);
        artmarkDataDecoder.parseMap();
    }
}