import java.io.*;
import java.util.*;

public class CSVWriter {

    public static void writeCSV(String filePath, List<String[]> data)
            throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        for (String[] row : data) {
            bw.write(String.join(",", row));
            bw.newLine();
        }
        bw.close();
    }
}
