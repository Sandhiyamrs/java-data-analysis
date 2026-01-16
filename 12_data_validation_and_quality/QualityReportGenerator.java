import java.util.*;

public class QualityReportGenerator {

    public static Map<String, Boolean> generate(boolean... checks) {
        Map<String, Boolean> report = new HashMap<>();
        for (int i = 0; i < checks.length; i++) {
            report.put("Check_" + (i + 1), checks[i]);
        }
        return report;
    }
}
