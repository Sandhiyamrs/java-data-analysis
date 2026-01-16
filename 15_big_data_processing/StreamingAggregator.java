import java.util.*;

public class StreamingAggregator {

    public static double sum(Stream<Double> stream) {
        return stream.mapToDouble(Double::doubleValue).sum();
    }
}

