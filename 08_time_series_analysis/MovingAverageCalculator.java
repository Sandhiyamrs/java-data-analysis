import java.util.*;

public class MovingAverageCalculator {

    public static List<Double> calculate(List<Double> data, int window) {
        List<Double> result = new ArrayList<>();
        for (int i = 0; i <= data.size() - window; i++) {
            double sum = 0;
            for (int j = 0; j < window; j++) {
                sum += data.get(i + j);
            }
            result.add(sum / window);
        }
        return result;
    }
}
