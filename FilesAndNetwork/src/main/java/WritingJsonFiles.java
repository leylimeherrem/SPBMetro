import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingJsonFiles {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/leylimeherrem/IdeaProjects/java_basics/java_basics5/FilesAndNetwork/src/main/resources/code.html";
        String jsonFilePath = "/Users/leylimeherrem/IdeaProjects/java_basics/java_basics5/FilesAndNetwork/src/main/resources/parser.json";

        Document doc = Jsoup.parse(new File(filePath), "UTF-8");
        Elements lines = doc.select("span[data-line]");
        Elements stations = doc.select("div[data-line]");

        JSONArray linesArray = new JSONArray();
        for (Element line : lines) {
            JSONObject lineObject = new JSONObject();
            String lineNumber = line.attr("data-line");
            String lineNumberFormatted = lineNumber.length() == 1 ? "0" + lineNumber : lineNumber;
            String lineName = line.text();
            lineObject.put("number", lineNumberFormatted);
            lineObject.put("name", lineName);
            linesArray.add(lineObject);
        }

        JSONArray stationsArray = new JSONArray();
        for (Element station : stations) {
            JSONObject stationObject = new JSONObject();
            String stationName = station.selectFirst("span.name").text();
            String lineNumber = station.attr("data-line");
            String lineNumberFormatted = lineNumber.length() == 1 ? "0" + lineNumber : lineNumber;
            stationObject.put("line", lineNumberFormatted);
            stationObject.put("name", stationName);
            stationsArray.add(stationObject);
        }

        JSONObject resultObject = new JSONObject();
        resultObject.put("lines", linesArray);
        resultObject.put("stations", stationsArray);

        FileWriter fileWriter = new FileWriter(jsonFilePath);
        fileWriter.write(resultObject.toJSONString());
        fileWriter.flush();
        fileWriter.close();
    }
}

