import java.util.List;

public class DataSet {
    private List<double[]> features;
    private List<Integer> labels;

    public DataSet(List<double[]> features, List<Integer> labels) {
        this.features = features;
        this.labels = labels;
    }

    public List<double[]> getFeatures() {
        return features;
    }

    public List<Integer> getLabels() {
        return labels;
    }
}
