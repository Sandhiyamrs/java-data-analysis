import java.util.*;

public class RangeValidator {

    public static boolean validate(List<Double> data, double min, double max) {
        return data.stream().allMatch(v -> v >= min && v <= max);
    }
}
