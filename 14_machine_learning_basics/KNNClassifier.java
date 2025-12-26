import java.util.*;

public class KNNClassifier {
    private int k;
    private List<double[]> XTrain;
    private List<Integer> yTrain;

    public KNNClassifier(int k) {
        this.k = k;
    }

    public void fit(List<double[]> X, List<Integer> y) {
        this.XTrain = X;
        this.yTrain = y;
    }

    public int predict(double[] x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            Comparator.comparingDouble(a -> a[0])
        );

        for (int i = 0; i < XTrain.size(); i++) {
            double dist = distance(x, XTrain.get(i));
            pq.add(new int[]{(int) dist, yTrain.get(i)});
        }

        Map<Integer, Integer> votes = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int label = pq.poll()[1];
            votes.put(label, votes.getOrDefault(label, 0) + 1);
        }

        return votes.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
    }

    private double distance(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += Math.pow(a[i] - b[i], 2);
        return Math.sqrt(sum);
    }
}
