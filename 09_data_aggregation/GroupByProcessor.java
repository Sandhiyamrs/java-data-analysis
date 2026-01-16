import java.util.*;

public class GroupByProcessor {

    public static Map<String, List<Double>> group(
            List<String> keys, List<Double> values) {

        Map<String, List<Double>> grouped = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            grouped
                .computeIfAbsent(keys.get(i), k -> new ArrayList<>())
                .add(values.get(i));
        }
        return grouped;
    }
}
