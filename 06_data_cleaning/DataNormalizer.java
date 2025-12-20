import java.util.*;

public class DataNormalizer {

    public static List<Double> minMaxNormalize(List<Double> data) {
        double min = Collections.min(data);
        double max = Collections.max(data);

        List<Double> normalized = new ArrayList<>();
        for (double value : data) {
            normalized.add((value - min) / (max - min));
        }
        return normalized;
    }
}
