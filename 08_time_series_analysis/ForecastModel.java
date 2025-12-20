import java.util.*;

public class ForecastModel {

    public static double naiveForecast(List<Double> data) {
        return data.get(data.size() - 1);
    }

    public static List<Double> multiStepForecast(List<Double> data, int steps) {
        List<Double> forecast = new ArrayList<>();
        double last = data.get(data.size() - 1);

        for (int i = 0; i < steps; i++) {
            forecast.add(last);
        }
        return forecast;
    }
}
