public class JSONValidator {

    public static boolean isValidJSON(String json) {
        return json.trim().startsWith("{") && json.trim().endsWith("}");
    }
}
