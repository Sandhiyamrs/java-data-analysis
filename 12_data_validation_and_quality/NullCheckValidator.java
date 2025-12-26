import java.util.*;

public class NullCheckValidator {

    public static boolean hasNulls(List<?> data) {
        return data.stream().anyMatch(Objects::isNull);
    }
}
