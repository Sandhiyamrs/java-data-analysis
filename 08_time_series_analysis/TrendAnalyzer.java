import java.util.*;

public class TrendAnalyzer {

    public static String analyzeTrend(List<Double> data) {
        if (data.size() < 2) return "INSUFFICIENT DATA";
        return data.get(data.size() - 1) > data.get(0)
                ? "UPWARD TREND"
                : "DOWNWARD TREND";
    }
}
