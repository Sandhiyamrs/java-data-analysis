import java.util.*;

public class SummaryReportGenerator {

    public static void generate(
            Map<String, List<Double>> groupedData) {

        for (Map.Entry<String, List<Double>> entry : groupedData.entrySet()) {
            String key = entry.getKey();
            List<Double> values = entry.getValue();

            System.out.println("Category: " + key);
            System.out.println("  Sum: " + AggregationFunctions.sum(values));
            System.out.println("  Avg: " + AggregationFunctions.average(values));
            System.out.println("  Min: " + AggregationFunctions.min(values));
            System.out.println("  Max: " + AggregationFunctions.max(values));
            System.out.println();
        }
    }
}
