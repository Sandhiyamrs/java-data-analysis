import java.io.*;

public class CSVValidator {

    public static boolean isValidCSV(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String header = br.readLine();
        br.close();
        return header != null && header.contains(",");
    }
}
