public class FeatureScaler {

    public static double scale(double value, double min, double max) {
        return (value - min) / (max - min);
    }
}
