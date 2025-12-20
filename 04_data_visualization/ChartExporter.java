import java.io.*;

public class ChartExporter {

    public static void export(String filePath, String chart)
            throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        bw.write(chart);
        bw.close();
    }
}
