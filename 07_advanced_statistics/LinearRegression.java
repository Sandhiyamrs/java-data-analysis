import java.util.*;

public class LinearRegression {

    private double slope;
    private double intercept;

    public void fit(List<Double> x, List<Double> y) {
        double meanX = mean(x);
        double meanY = mean(y);

        double num = 0;
        double den = 0;

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

    private double mean(List<Double> data) {
        return data.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}
