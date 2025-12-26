import java.util.List;

public class ParallelProcessor {

    public static void process(List<Runnable> tasks) {
        tasks.parallelStream().forEach(Runnable::run);
    }
}
