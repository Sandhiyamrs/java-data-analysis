import java.util.*;

public class BigDataRunner {

    public static void main(String[] args) {
        List<Runnable> tasks = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            tasks.add(() ->
                System.out.println("Processing chunk " + taskId)
            );
        }

        ParallelProcessor.process(tasks);
    }
}
