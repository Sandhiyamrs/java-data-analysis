public class ProbabilityUtils {

    public static double probability(int favorable, int total) {
        if (total == 0)
            throw new IllegalArgumentException("Total cannot be zero");
        return (double) favorable / total;
    }
}
