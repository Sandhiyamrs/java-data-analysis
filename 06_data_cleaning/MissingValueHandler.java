import java.util.*;

public class MissingValueHandler {

    public static List<Double> removeNulls(List<Double> data) {
        List<Double> result = new ArrayList<>();
        for (Double v : data) {
            if (v != null) result.add(v);
        }
        return result;
    }
}
