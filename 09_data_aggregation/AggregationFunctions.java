import java.util.*;

public class AggregationFunctions {

    public static double sum(List<Double> data) {
        return data.stream().mapToDouble(Double::doubleValue).sum();
    }

    public static double average(List<Double> data) {
        return sum(data) / data.size();
    }

    public static double max(List<Double> data) {
        return Collections.max(data);
    }

    public static double min(List<Double> data) {
        return Collections.min(data);
    }
}
