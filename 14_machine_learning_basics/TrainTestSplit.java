import java.util.*;

public class TrainTestSplit {

    public static DataSet[] split(DataSet data, double ratio) {
        int split = (int) (data.features.size() * ratio);
        return new DataSet[]{
                new DataSet(
                        data.features.subList(0, split),
                        data.labels.subList(0, split)),
                new DataSet(
                        data.features.subList(split, data.features.size()),
                        data.labels.subList(split, data.labels.size()))
        };
    }
}
