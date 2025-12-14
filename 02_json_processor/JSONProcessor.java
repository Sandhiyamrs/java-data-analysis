import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONProcessor {
    public static void main(String[] args) throws Exception {
        String path = "../05_demo_dataset/sample_data.json";
        String content = new String(Files.readAllBytes(Paths.get(path)));
        JSONArray jsonArray = new JSONArray(content);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            System.out.println("Name: " + obj.getString("name") + ", Age: " + obj.getInt("age"));
        }
    }
}

