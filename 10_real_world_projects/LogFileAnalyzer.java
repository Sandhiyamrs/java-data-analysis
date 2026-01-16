import java.util.*;

public class LogFileAnalyzer {

    public static long errorCount(List<String> logs) {
        return logs.stream()
                .filter(l -> l.contains("ERROR"))
                .count();
    }
}
