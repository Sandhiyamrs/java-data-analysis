import java.util.List;

public class CSVValidator {

    public static boolean validateColumnCount(List<String[]> rows) {
        if (rows.isEmpty()) return false;

        int columns = rows.get(0).length;
        return rows.stream().allMatch(r -> r.length == columns);
    }
}
