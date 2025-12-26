import java.io.*;
import java.util.*;

public class FileChunkReader {

    public static List<List<String>> readChunks(String file, int chunkSize)
            throws IOException {

        List<List<String>> chunks = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        List<String> chunk = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            chunk.add(line);
            if (chunk.size() == chunkSize) {
                chunks.add(chunk);
                chunk = new ArrayList<>();
            }
        }
        if (!chunk.isEmpty()) chunks.add(chunk);
        br.close();
        return chunks;
    }
}
