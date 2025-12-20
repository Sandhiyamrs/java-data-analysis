import java.util.*;

public class OutlierDetector {

    public static List<Double> removeOutliers(List<Double> data) {
        double mean = calculateMean(data);
        double stdDev = calculateStdDev(data, mean);

        List<Double> filtered = new ArrayList<>();
        for (Double value : data) {
            if (Math.abs(value - mean) <= 2 * stdDev) {
                filtered.add(value);
            }
        }
        return filtered;
    }

    private static double calculateMean(List<Double> data) {
        double sum = 0;
        for (double d : data) sum += d;
        return sum / data.size();
    }

    private static double calculateStdDev(List<Double> data, double mean) {
        double sum = 0;
        for (double d : data) {
            sum += Math.pow(d - mean, 2);
        }
        return Math.sqrt(sum / data.size());
    }
}
