import java.util.*;

public class JSONFlattener {

    public static Map<String, String> flatten(Map<String, Object> json) {
        Map<String, String> flat = new HashMap<>();
        for (Map.Entry<String, Object> entry : json.entrySet()) {
            flat.put(entry.getKey(), entry.getValue().toString());
        }
        return flat;
    }
}
