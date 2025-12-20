import java.util.*;

public class SeasonalityDetector {

    public static boolean hasSeasonality(List<Double> data, int period) {
        if (data.size() < period * 2) return false;

        for (int i = 0; i < period; i++) {
            if (!data.get(i).equals(data.get(i + period))) {
                return false;
            }
        }
        return true;
    }
}
