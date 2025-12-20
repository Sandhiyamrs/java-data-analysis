import java.util.*;

public class PercentileCalculator {

    public static double percentile(List<Double> data, double p) {
        Collections.sort(data);
        int index = (int) Math.ceil(p / 100 * data.size()) - 1;
        return data.get(index);
    }
}
