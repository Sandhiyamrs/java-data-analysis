public class PipelineRunner {

    public static void main(String[] args) {
        PipelineContext context = new PipelineContext();
        DataPipeline pipeline = new DataPipeline();

        pipeline.run(context);
    }
}
