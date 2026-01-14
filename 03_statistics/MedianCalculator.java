import java.util.*;

public class MedianCalculator {

    public static double median(List<Double> data) {
        if (data == null || data.isEmpty())
            throw new IllegalArgumentException("Dataset is empty");

        List<Double> sorted = new ArrayList<>(data);
        Collections.sort(sorted);

        int n = sorted.size();
        if (n % 2 == 0) {
            return (sorted.get(n / 2 - 1) + sorted.get(n / 2)) / 2.0;
        }
        return sorted.get(n / 2);
    }
}

