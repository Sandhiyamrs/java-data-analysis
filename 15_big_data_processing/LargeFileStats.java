import java.io.*;

public class LargeFileStats {

    public static int lineCount(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        int count = 0;
        while (br.readLine() != null) count++;
        br.close();
        return count;
    }
}
