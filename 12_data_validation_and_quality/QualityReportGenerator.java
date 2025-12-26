public class QualityReportGenerator {

    public static void report(boolean status) {
        System.out.println(
            status ? "Data Quality: PASS" : "Data Quality: FAIL"
        );
    }
}
