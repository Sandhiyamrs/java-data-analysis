import java.util.*;

public class SchemaValidator {

    public static boolean validateHeaders(
            List<String> headers, List<String> expected) {
        return headers.equals(expected);
    }
}
