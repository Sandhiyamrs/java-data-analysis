import java.util.*;

public class CSVFilter {

    public static List<String[]> filterByColumn(
            List<String[]> rows, int colIndex, String value) {

        List<String[]> result = new ArrayList<>();
        for (String[] row : rows) {
            if (row[colIndex].equals(value)) {
                result.add(row);
            }
        }
        return result;
    }
}
