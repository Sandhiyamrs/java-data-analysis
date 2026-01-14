import java.io.*;
import java.util.List;

public class ChartExporter {

    public static void export(String filePath, List<Double> data)
            throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (double v : data) {
                bw.write(String.valueOf(v));
                bw.newLine();
            }
        }
    }
}
