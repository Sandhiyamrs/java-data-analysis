import java.util.*;

public class ForecastModel {

    public static double forecastNext(List<Double> data) {
        return data.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}
