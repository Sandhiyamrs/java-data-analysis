import java.util.*;

public class PivotTableBuilder {

    public static Map<String, Double> pivot(
            Map<String, List<Double>> groupedData) {

        Map<String, Double> pivot = new HashMap<>();
        groupedData.forEach(
            (k, v) -> pivot.put(k, AggregationFunctions.sum(v))
        );
        return pivot;
    }
}
