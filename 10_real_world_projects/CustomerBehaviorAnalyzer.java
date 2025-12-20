import java.util.*;

public class CustomerBehaviorAnalyzer {

    public static String loyaltyLevel(int purchases) {
        if (purchases > 50) return "Platinum";
        if (purchases > 25) return "Gold";
        if (purchases > 10) return "Silver";
        return "New Customer";
    }
}
