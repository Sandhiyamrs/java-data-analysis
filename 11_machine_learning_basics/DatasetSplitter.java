import java.util.*;

public class DatasetSplitter {

    public static Map<String, List<double[]>> split(
            List<double[]> data, double trainRatio) {

        Collections.shuffle(data);
        int splitIndex = (int) (data.size() * trainRatio);

        Map<String, List<double[]>> result = new HashMap<>();
        result.put("train", data.subList(0, splitIndex));
        result.put("test", data.subList(splitIndex, data.size()));
        return result;
    }
}
