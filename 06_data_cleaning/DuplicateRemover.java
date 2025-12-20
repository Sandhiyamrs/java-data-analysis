import java.util.*;

public class DuplicateRemover {

    public static List<Double> removeDuplicates(List<Double> data) {
        return new ArrayList<>(new LinkedHashSet<>(data));
    }
}
