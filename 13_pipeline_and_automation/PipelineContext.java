import java.util.*;

public class PipelineContext {
    private Map<String, Object> data = new HashMap<>();
    public void put(String key, Object value) { data.put(key, value); }
    public Object get(String key) { return data.get(key); }
}
