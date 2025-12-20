import java.util.*;

public class WeatherTrendAnalyzer {

    public static double averageTemperature(List<Double> temps) {
        return temps.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public static String climateTrend(double avgTemp) {
        return avgTemp > 30 ? "Hot Climate" : "Moderate Climate";
    }
}
