import java.util.*;

public class SummaryReportGenerator {

    public static void print(Map<String, Double> report) {
        report.forEach((k, v) ->
            System.out.println(k + " : " + v)
        );
    }
}
