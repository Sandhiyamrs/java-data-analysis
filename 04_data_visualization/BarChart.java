import java.util.List;

public class BarChart extends SimpleChart {

    public BarChart(List<Double> data) {
        super(data);
    }

    @Override
    public void render() {
        for (double value : data) {
            System.out.printf("%5.1f | ", value);
            for (int i = 0; i < value; i++) {
                System.out.print("█");
            }
            System.out.println();
        }
    }
}
