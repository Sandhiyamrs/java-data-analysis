import java.util.*;

public class LinearRegression {

    private double slope;
    private double intercept;

    public void fit(List<Double> x, List<Double> y) {
        double meanX = x.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double meanY = y.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        double num = 0, den = 0;
        for (int i = 0; i < x.size(); i++) {
            num += (x.get(i) - meanX) * (y.get(i) - meanY);
            den += Math.pow(x.get(i) - meanX, 2);
        }

        slope = num / den;
        intercept = meanY - slope * meanX;
    }

    public double predict(double x) {
        return slope * x + intercept;
    }
}
