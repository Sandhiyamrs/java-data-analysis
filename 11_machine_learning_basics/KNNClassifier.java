import java.util.*;

public class KNNClassifier {

    public static int classify(
            double[] input,
            List<double[]> data,
            List<Integer> labels,
            int k) {

        List<Integer> neighbors = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            neighbors.add(labels.get(i));
            if (neighbors.size() == k) break;
        }
        return neighbors.get(0);
    }
}
