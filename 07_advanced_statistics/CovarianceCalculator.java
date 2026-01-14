import java.util.*;

public class CovarianceCalculator {

    public static double covariance(List<Double> x, List<Double> y) {
        if (x.size() != y.size())
            throw new IllegalArgumentException("Datasets must be same size");

        double meanX = x.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double meanY = y.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        double sum = 0;
        for (int i = 0; i < x.size(); i++) {
            sum += (x.get(i) - meanX) * (y.get(i) - meanY);
        }
        return sum / (x.size() - 1);
    }
}
