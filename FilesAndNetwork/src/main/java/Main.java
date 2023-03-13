import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        MoscowMetroLines moscowMetroLines = new MoscowMetroLines();
        moscowMetroLines.getLine();

        MoscowMetroStations moscowMetroStations = new MoscowMetroStations();
        moscowMetroStations.getStation();

        FileSearch fileSearch = new FileSearch();
        fileSearch.search("/Users/leylimeherrem/Desktop/data");



        JsonFilesParsing jsonFilesParsing = new JsonFilesParsing();
        JSONArray jsonArray = jsonFilesParsing.getJsonFile();
        if (jsonArray != null) {
            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                String stationName = (String) jsonObject.get("station_name");
                String depth = (String) jsonObject.get("depth");
                System.out.println("Название Станции: " + stationName + ", Глубина: " + depth);
            }
        }

        String filePath = "/Users/leylimeherrem/IdeaProjects/java_basics/java_basics5/FilesAndNetwork/src/main/resources/dates-1.csv";
        CSVFilesParsing parser = new CSVFilesParsing(filePath);
        try {
            List<CSVData> dataList = parser.parse();
            for (CSVData data : dataList) {
                System.out.println(data.getName() + " - " + data.getDate());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }



    }

}


