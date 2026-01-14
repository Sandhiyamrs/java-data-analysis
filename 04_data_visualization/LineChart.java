import java.util.List;

public class LineChart extends SimpleChart {

    public LineChart(List<Double> data) {
        super(data);
    }

    @Override
    public void render() {
        System.out.println("Line Chart (simulated):");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(i + " -> " + data.get(i));
        }
    }
}
