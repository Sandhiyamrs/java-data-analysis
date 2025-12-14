import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) {
        double[] data = {10, 20, 20, 30, 40, 50};
        double sum = 0;
        for (double num : data) sum += num;

        double mean = sum / data.length;

        Arrays.sort(data);
        double median = data.length % 2 == 0
                ? (data[data.length/2 - 1] + data[data.length/2]) / 2
                : data[data.length/2];

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
    }
}

