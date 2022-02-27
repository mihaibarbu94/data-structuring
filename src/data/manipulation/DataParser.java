package src.data.manipulation;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DataParser {

    public Map<String, String> parse() {
        final Map<String, String> map = new HashMap<String, String>();
        Map<String, String> anotherList = new HashMap<>();

        try {
            FileInputStream fis = new FileInputStream("data-source/map.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            anotherList = (Map<String, String>) ois.readObject();

            ois.close();

            System.out.println(anotherList);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return anotherList;
    }
}
