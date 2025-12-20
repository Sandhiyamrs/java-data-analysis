import java.util.*;

public class MissingValueHandler {

    public static List<Double> removeMissing(List<Double> data) {
        List<Double> result = new ArrayList<>();
        for (Double value : data) {
            if (value != null) {
                result.add(value);
            }
        }
        return result;
    }

    public static List<Double> replaceWithMean(List<Double> data) {
        double sum = 0;
        int count = 0;

        for (Double value : data) {
            if (value != null) {
                sum += value;
                count++;
            }
        }

        double mean = sum / count;
        List<Double> result = new ArrayList<>();

        for (Double value : data) {
            result.add(value == null ? mean : value);
        }
        return result;
    }
}
