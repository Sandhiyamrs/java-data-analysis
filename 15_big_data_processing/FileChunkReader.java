import java.io.*;
import java.util.*;

public class FileChunkReader {

    public static List<String> readChunk(File file, int lines) throws IOException {
        List<String> chunk = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while (lines-- > 0 && (line = br.readLine()) != null) {
                chunk.add(line);
            }
        }
        return chunk;
    }
}
