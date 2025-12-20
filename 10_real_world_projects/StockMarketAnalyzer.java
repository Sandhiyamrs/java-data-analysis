import java.util.*;

public class StockMarketAnalyzer {

    public static double dailyReturn(double open, double close) {
        return (close - open) / open * 100;
    }

    public static String marketSentiment(double change) {
        return change > 0 ? "Bullish" : "Bearish";
    }
}
