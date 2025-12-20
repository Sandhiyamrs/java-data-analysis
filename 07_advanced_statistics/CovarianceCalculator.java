import java.util.*;

public class CovarianceCalculator {

    public static double covariance(List<Double> x, List<Double> y) {
        if (x.size() != y.size()) {
            throw new IllegalArgumentException("Input sizes must match");
        }

        double meanX = mean(x);
        double meanY = mean(y);
        double sum = 0;

        for (int i = 0; i < x.size(); i++) {
            sum += (x.get(i) - meanX) * (y.get(i) - meanY);
        }

        return sum / (x.size() - 1);
    }

    private static double mean(List<Double> data) {
        double sum = 0;
        for (double d : data) sum += d;
        return sum / data.size();
    }
}
