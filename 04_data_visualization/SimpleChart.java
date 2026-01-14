import java.util.List;

public abstract class SimpleChart {

    protected List<Double> data;

    public SimpleChart(List<Double> data) {
        this.data = data;
    }

    public abstract void render();
}
