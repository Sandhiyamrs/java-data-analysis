import java.util.*;

public class DistributionAnalyzer {

    public static Map<String, Double> summarize(List<Double> data) {
        Map<String, Double> stats = new HashMap<>();
        stats.put("min", Collections.min(data));
        stats.put("max", Collections.max(data));
        stats.put("mean", data.stream().mapToDouble(Double::doubleValue).average().orElse(0));
        return stats;
    }
}
