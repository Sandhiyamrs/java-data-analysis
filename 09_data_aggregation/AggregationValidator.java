import java.util.*;

public class AggregationValidator {

    public static boolean validate(List<?> keys, List<?> values) {
        return keys.size() == values.size();
    }
}
