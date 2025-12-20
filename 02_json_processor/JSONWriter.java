import java.io.*;

public class JSONWriter {

    public static void write(String filePath, String json)
            throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        bw.write(json);
        bw.close();
    }
}
