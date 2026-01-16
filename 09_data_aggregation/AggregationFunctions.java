import java.util.*;

public class AggregationFunctions {

    public static double sum(List<Double> data) {
        return data.stream().mapToDouble(Double::doubleValue).sum();
    }

    public static double average(List<Double> data) {
        return data.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}
