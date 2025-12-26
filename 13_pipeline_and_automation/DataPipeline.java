import java.util.*;

public class DataPipeline {

    private List<PipelineStep> steps = new ArrayList<>();

    public void addStep(PipelineStep step) {
        steps.add(step);
    }

    public void run(PipelineContext context) {
        for (PipelineStep step : steps) {
            step.execute(context);
        }
    }
}
