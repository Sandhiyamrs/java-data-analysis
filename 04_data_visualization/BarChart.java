import java.util.*;

public class BarChart {

    public static void draw(Map<String, Integer> data) {
        for (Map.Entry<String, Integer> e : data.entrySet()) {
            System.out.print(e.getKey() + " | ");
            for (int i = 0; i < e.getValue(); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
