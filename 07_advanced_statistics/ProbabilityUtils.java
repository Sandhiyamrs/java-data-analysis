public class ProbabilityUtils {

    public static double factorial(int n) {
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static double binomialProbability(int n, int r, double p) {
        return combination(n, r) * Math.pow(p, r) * Math.pow(1 - p, n - r);
    }
}
