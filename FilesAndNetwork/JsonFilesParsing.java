import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JsonFilesParsing {
    public static final String DATA_FILE = "/Users/leylimeherrem/IdeaProjects/java_basics/java_basics5/FilesAndNetwork/data/depths-1.json";

    public static JSONArray getJsonFile() {
        try {
            Path pathToFile = Paths.get(DATA_FILE);
            List<String> lines = Files.readAllLines(pathToFile);
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(String.join("", lines));
            return jsonArray;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
