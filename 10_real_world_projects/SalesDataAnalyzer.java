import java.util.*;

public class SalesDataAnalyzer {

    public static double totalSales(List<Double> sales) {
        return sales.stream().mapToDouble(Double::doubleValue).sum();
    }

    public static double averageSales(List<Double> sales) {
        return totalSales(sales) / sales.size();
    }
}
