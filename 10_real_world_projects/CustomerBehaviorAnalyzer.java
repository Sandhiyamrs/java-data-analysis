import java.util.*;

public class CustomerBehaviorAnalyzer {

    public static int activeUsers(List<Boolean> activity) {
        return (int) activity.stream().filter(b -> b).count();
    }
}
