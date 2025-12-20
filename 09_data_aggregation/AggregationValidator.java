import java.util.*;

public class AggregationValidator {

    public static boolean validateInput(
            List<String> keys, List<Double> values) {
        return keys != null &&
               values != null &&
               keys.size() == values.size() &&
               !keys.isEmpty();
    }
}
