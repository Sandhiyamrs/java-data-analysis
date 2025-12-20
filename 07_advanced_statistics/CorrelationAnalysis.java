import java.util.*;

public class CorrelationAnalysis {

    public static double pearsonCorrelation(List<Double> x, List<Double> y) {
        if (x.size() != y.size()) {
            throw new IllegalArgumentException("Lists must be of same length");
        }

        double meanX = mean(x);
        double meanY = mean(y);

        double numerator = 0;
        double denomX = 0;
        double denomY = 0;

        for (int i = 0; i < x.size(); i++) {
            double dx = x.get(i) - meanX;
            double dy = y.get(i) - meanY;
            numerator += dx * dy;
            denomX += dx * dx;
            denomY += dy * dy;
        }

        return numerator / Math.sqrt(denomX * denomY);
    }

    private static double mean(List<Double> data) {
        double sum = 0;
        for (double d : data) sum += d;
        return sum / data.size();
    }
}
