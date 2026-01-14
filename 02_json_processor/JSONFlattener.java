import java.util.*;

public class JSONFlattener {

    public static Map<String, Object> flatten(
            Map<String, Object> nestedMap,
            String parentKey
    ) {
        Map<String, Object> flatMap = new HashMap<>();

        for (Map.Entry<String, Object> entry : nestedMap.entrySet()) {
            String newKey = parentKey.isEmpty()
                    ? entry.getKey()
                    : parentKey + "." + entry.getKey();

            Object value = entry.getValue();

            if (value instanceof Map) {
                flatMap.putAll(flatten((Map<String, Object>) value, newKey));
            } else {
                flatMap.put(newKey, value);
            }
        }
        return flatMap;
    }
}
