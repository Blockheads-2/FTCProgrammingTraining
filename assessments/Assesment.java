package assessments;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Assesment {
    public static void main(String[] args) {
        String path = "/app/json/companies.json";
 
        JSONObject json = new JSONObject();
        try {
            json.put("answer", "test");
            json.put("I don't know", List.of("Mountain View", "Los Angeles", "New York"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
 
        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(json.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
