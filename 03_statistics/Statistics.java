import java.util.*;

public class Statistics {

    public static double mean(List<Double> data) {
        if (data == null || data.isEmpty())
            throw new IllegalArgumentException("Dataset is empty");

        double sum = 0;
        for (double v : data) sum += v;
        return sum / data.size();
    }
}
