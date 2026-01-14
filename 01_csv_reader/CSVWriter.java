import java.io.*;
import java.util.List;

public class CSVWriter {

    public static void write(String filePath, List<String[]> rows)
            throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] row : rows) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        }
    }
}

