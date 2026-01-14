import java.util.*;

public class OutlierDetector {

    public static List<Double> removeOutliers(List<Double> data) {
        if (data.size() < 4) return data;

        double mean = data.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double stdDev = Math.sqrt(
            data.stream()
                .mapToDouble(v -> Math.pow(v - mean, 2))
                .average()
                .orElse(0)
        );

        List<Double> filtered = new ArrayList<>();
        for (double v : data) {
            if (Math.abs(v - mean) <= 2 * stdDev) {
                filtered.add(v);
            }
        }
        return filtered;
    }
}
