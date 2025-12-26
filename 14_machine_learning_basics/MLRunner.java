import java.util.*;

public class MLRunner {
    public static void main(String[] args) {
        List<double[]> X = List.of(
            new double[]{1, 2},
            new double[]{2, 3},
            new double[]{3, 4},
            new double[]{6, 7}
        );
        List<Integer> y = List.of(0, 0, 1, 1);

        KNNClassifier knn = new KNNClassifier(3);
        knn.fit(X, y);

        int prediction = knn.predict(new double[]{2, 2});
        System.out.println("Predicted class: " + prediction);
    }
}
