import java.util.*;

public class CorrelationAnalysis {

    public static double pearson(List<Double> x, List<Double> y) {
        if (x.size() != y.size())
            throw new IllegalArgumentException("Datasets must be same size");

        double meanX = x.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double meanY = y.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        double num = 0, denX = 0, denY = 0;

        for (int i = 0; i < x.size(); i++) {
            num += (x.get(i) - meanX) * (y.get(i) - meanY);
            denX += Math.pow(x.get(i) - meanX, 2);
            denY += Math.pow(y.get(i) - meanY, 2);
        }

        return num / Math.sqrt(denX * denY);
    }
}
