import java.io.*;
import java.util.*;

public class JSONProcessor {

    public static String readJson(String filePath) throws IOException {
        StringBuilder json = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                json.append(line.trim());
            }
        }
        return json.toString();
    }

    public static Map<String, Object> parseFlatJson(String json) {
        Map<String, Object> result = new HashMap<>();

        json = json.trim();
        json = json.substring(1, json.length() - 1); // remove { }

        String[] pairs = json.split(",");

        for (String pair : pairs) {
            String[] kv = pair.split(":", 2);
            String key = kv[0].replace("\"", "").trim();
            String value = kv[1].replace("\"", "").trim();
            result.put(key, value);
        }
        return result;
    }
}
