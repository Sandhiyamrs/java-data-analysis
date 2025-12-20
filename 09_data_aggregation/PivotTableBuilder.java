import java.util.*;

public class PivotTableBuilder {

    public static Map<String, Map<String, Double>> pivot(
            List<String> rows,
            List<String> columns,
            List<Double> values) {

        Map<String, Map<String, Double>> table = new HashMap<>();

        for (int i = 0; i < rows.size(); i++) {
            table
                .computeIfAbsent(rows.get(i), r -> new HashMap<>())
                .merge(columns.get(i), values.get(i), Double::sum);
        }
        return table;
    }
}
