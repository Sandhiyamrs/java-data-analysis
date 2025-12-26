import java.util.List;

public class AccuracyEvaluator {

    public static double accuracy(List<Integer> actual, List<Integer> predicted) {
        int correct = 0;
        for (int i = 0; i < actual.size(); i++) {
            if (actual.get(i).equals(predicted.get(i)))
                correct++;
        }
        return (double) correct / actual.size();
    }
}
