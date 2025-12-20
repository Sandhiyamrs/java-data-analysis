import java.util.*;

public class DataCleaner {

    public static List<Double> clean(List<Double> data) {
        List<Double> cleaned = new ArrayList<>(data);

        cleaned = MissingValueHandler.removeMissing(cleaned);
        cleaned = OutlierDetector.removeOutliers(cleaned);
        cleaned = DuplicateRemover.removeDuplicates(cleaned);
        cleaned = DataNormalizer.minMaxNormalize(cleaned);

        return cleaned;
    }

    public static void main(String[] args) {
        List<Double> rawData = Arrays.asList(10.0, null, 15.0, 1000.0, 15.0, 20.0);

        List<Double> cleanedData = clean(rawData);
        System.out.println("Cleaned Data: " + cleanedData);
    }
}
