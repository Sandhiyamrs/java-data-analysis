import java.io.*;
import java.util.*;

public class TimeSeriesReader {

    public static List<Double> readSeries(String filePath) throws IOException {
        List<Double> series = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                series.add(Double.parseDouble(line.trim()));
            }
        }
        return series;
    }
}
