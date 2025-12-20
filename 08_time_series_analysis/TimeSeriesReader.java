import java.io.*;
import java.util.*;

public class TimeSeriesReader {

    public static Map<String, Double> readCSV(String filePath) throws IOException {
        Map<String, Double> series = new LinkedHashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            series.put(parts[0], Double.parseDouble(parts[1]));
        }
        br.close();
        return series;
    }
}
