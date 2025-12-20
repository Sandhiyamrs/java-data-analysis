import java.util.*;

public class DistributionAnalyzer {

    public static double normalPDF(double x, double mean, double stdDev) {
        double exponent = -Math.pow(x - mean, 2) / (2 * Math.pow(stdDev, 2));
        return (1 / (stdDev * Math.sqrt(2 * Math.PI))) * Math.exp(exponent);
    }

    public static double calculateSkewness(List<Double> data) {
        double mean = mean(data);
        double std = stdDev(data, mean);
        double sum = 0;

        for (double d : data) {
            sum += Math.pow((d - mean) / std, 3);
        }
        return sum / data.size();
    }

    private static double mean(List<Double> data) {
        return data.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    private static double stdDev(List<Double> data, double mean) {
        double sum = 0;
        for (double d : data) sum += Math.pow(d - mean, 2);
        return Math.sqrt(sum / data.size());
    }
}
