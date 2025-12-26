import java.util.List;

public class StreamingAggregator {

    public static double sum(List<Double> stream) {
        double total = 0;
        for (double v : stream) total += v;
        return total;
    }
}
