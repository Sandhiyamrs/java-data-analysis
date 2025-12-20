import java.util.*;

public class LogFileAnalyzer {

    public static Map<String, Integer> countLogLevels(List<String> logs) {
        Map<String, Integer> counts = new HashMap<>();

        for (String log : logs) {
            String level = log.split(" ")[0];
            counts.put(level, counts.getOrDefault(level, 0) + 1);
        }
        return counts;
    }
}
