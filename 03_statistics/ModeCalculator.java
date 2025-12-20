import java.util.*;

public class ModeCalculator {

    public static double mode(List<Double> data) {
        Map<Double, Integer> freq = new HashMap<>();
        for (double d : data) {
            freq.put(d, freq.getOrDefault(d, 0) + 1);
        }
        return Collections.max(freq.entrySet(),
                Map.Entry.comparingByValue()).getKey();
    }
}
