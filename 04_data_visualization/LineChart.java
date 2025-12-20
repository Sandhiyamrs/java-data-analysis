import java.util.*;

public class LineChart {

    public static void draw(List<Double> data) {
        for (double d : data) {
            System.out.println("• ".repeat((int) d));
        }
    }
}
