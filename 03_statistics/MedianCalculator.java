import java.util.*;

public class MedianCalculator {

    public static double median(List<Double> data) {
        Collections.sort(data);
        int n = data.size();
        return n % 2 == 0
                ? (data.get(n/2 - 1) + data.get(n/2)) / 2
                : data.get(n/2);
    }
}
