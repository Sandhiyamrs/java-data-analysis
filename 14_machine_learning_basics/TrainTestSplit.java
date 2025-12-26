import java.util.*;

public class TrainTestSplit {

    public static Map<String, DataSet> split(
            List<double[]> X, List<Integer> y, double testRatio) {

        int testSize = (int) (X.size() * testRatio);
        List<double[]> XTest = X.subList(0, testSize);
        List<Integer> yTest = y.subList(0, testSize);

        List<double[]> XTrain = X.subList(testSize, X.size());
        List<Integer> yTrain = y.subList(testSize, y.size());

        Map<String, DataSet> result = new HashMap<>();
        result.put("train", new DataSet(XTrain, yTrain));
        result.put("test", new DataSet(XTest, yTest));

        return result;
    }
}
