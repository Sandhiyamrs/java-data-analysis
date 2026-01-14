import java.util.*;

public class PercentileCalculator {

    public static double percentile(List<Double> data, double percentile) {
        if (data == null || data.isEmpty())
            throw new IllegalArgumentException("Dataset is empty");

        if (percentile < 0 || percentile > 100)
            throw new IllegalArgumentException("Percentile must be between 0 and 100");

        List<Double> sorted = new ArrayList<>(data);
        Collections.sort(sorted);

        int index = (int) Math.ceil(percentile / 100.0 * sorted.size()) - 1;
        return sorted.get(Math.max(0, index));
    }
}
