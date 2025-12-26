import java.util.*;

public class KNNClassifier {

    public static int predict(
            List<double[]> train, List<Integer> labels,
            double[] test, int k) {

        List<Integer> nearest = new ArrayList<>();

        for (int i = 0; i < train.size(); i++) {
            nearest.add(labels.get(i));
        }
        return nearest.stream()
                .limit(k)
                .max(Integer::compare)
                .orElse(0);
    }
}
