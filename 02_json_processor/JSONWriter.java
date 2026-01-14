import java.io.*;
import java.util.Map;

public class JSONWriter {

    public static void write(String filePath, Map<String, Object> data)
            throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("{\n");
            int count = 0;

            for (Map.Entry<String, Object> entry : data.entrySet()) {
                bw.write("  \"" + entry.getKey() + "\": \"" + entry.getValue() + "\"");
                count++;
                if (count < data.size()) bw.write(",");
                bw.newLine();
            }
            bw.write("}");
        }
    }
}
