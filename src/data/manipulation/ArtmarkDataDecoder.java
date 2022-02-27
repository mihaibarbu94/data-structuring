package src.data.manipulation;

import java.util.Map;

public class ArtmarkDataDecoder {
    final Map<String, String> dataMap;

    public ArtmarkDataDecoder(final Map<String, String> dataMap) {
        this.dataMap = dataMap;
    }

    public Map<String, String> parseMap(){

        return dataMap;
    }
}
