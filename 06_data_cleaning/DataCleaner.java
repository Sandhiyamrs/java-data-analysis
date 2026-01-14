import java.util.List;

public class DataCleaner {

    public static List<Double> clean(List<Double> data) {
        List<Double> cleaned = MissingValueHandler.removeNulls(data);
        cleaned = DuplicateRemover.removeDuplicates(cleaned);
        cleaned = OutlierDetector.removeOutliers(cleaned);
        return DataNormalizer.normalize(cleaned);
    }
}
