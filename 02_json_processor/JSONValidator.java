public class JSONValidator {

    public static boolean isValidJson(String json) {
        if (json == null || json.isEmpty()) return false;

        json = json.trim();
        return json.startsWith("{") && json.endsWith("}");
    }
}
