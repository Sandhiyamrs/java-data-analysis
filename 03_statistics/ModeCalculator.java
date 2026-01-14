import java.util.*;

public class ModeCalculator {

    public static double mode(List<Double> data) {
        if (data == null || data.isEmpty())
            throw new IllegalArgumentException("Dataset is empty");

        Map<Double, Integer> freq = new HashMap<>();
        for (double v : data)
            freq.put(v, freq.getOrDefault(v, 0) + 1);

        return Collections.max(freq.entrySet(),
                Map.Entry.comparingByValue()).getKey();
    }
}
