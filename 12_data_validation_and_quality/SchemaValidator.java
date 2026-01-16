import java.util.*;

public class SchemaValidator {

    public static boolean validateLength(List<String[]> rows, int expected) {
        return rows.stream().allMatch(r -> r.length == expected);
    }
}
