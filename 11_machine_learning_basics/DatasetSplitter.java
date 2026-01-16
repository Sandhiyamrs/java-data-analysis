import java.util.*;

public class DatasetSplitter {

    public static List<List<double[]>> split(List<double[]> data, double ratio) {
        int splitIndex = (int) (data.size() * ratio);
        return List.of(
                data.subList(0, splitIndex),
                data.subList(splitIndex, data.size())
        );
    }
}
