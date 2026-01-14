import java.util.*;

public class DataNormalizer {

    public static List<Double> normalize(List<Double> data) {
        double min = Collections.min(data);
        double max = Collections.max(data);

        List<Double> normalized = new ArrayList<>();
        for (double v : data) {
            normalized.add((v - min) / (max - min));
        }
        return normalized;
    }
}
