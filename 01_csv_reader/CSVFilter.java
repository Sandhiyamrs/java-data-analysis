import java.util.*;
import java.util.function.Predicate;

public class CSVFilter {

    public static List<String[]> filter(
            List<String[]> rows,
            Predicate<String[]> condition
    ) {
        List<String[]> result = new ArrayList<>();
        for (String[] row : rows) {
            if (condition.test(row)) {
                result.add(row);
            }
        }
        return result;
    }
}
