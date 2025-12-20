import java.util.*;

public class TrendAnalyzer {

    public static String detectTrend(List<Double> data) {
        if (data.size() < 2) return "Insufficient data";

        double start = data.get(0);
        double end = data.get(data.size() - 1);

        if (end > start) return "Upward Trend";
        if (end < start) return "Downward Trend";
        return "No Trend";
    }
}
