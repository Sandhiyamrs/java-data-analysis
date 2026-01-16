import java.util.*;

public class DataSet {

    public List<double[]> features;
    public List<Integer> labels;

    public DataSet(List<double[]> f, List<Integer> l) {
        features = f;
        labels = l;
    }
}
