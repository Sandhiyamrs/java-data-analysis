public class FeatureScaler {

    public static double[] minMax(double[] data) {
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        for (double d : data) {
            min = Math.min(min, d);
            max = Math.max(max, d);
        }
        double[] scaled = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            scaled[i] = (data[i] - min) / (max - min);
        }
        return scaled;
    }
}
