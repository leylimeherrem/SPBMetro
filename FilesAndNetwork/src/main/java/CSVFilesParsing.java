import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFilesParsing {
    private String filePath;

    public CSVFilesParsing(String filePath) {
        this.filePath = filePath;
    }

    public List<CSVData> parse() throws IOException {
        List<CSVData> dataList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            String name = values[0];
            String date = values[1];
            CSVData data = new CSVData(name, date);
            dataList.add(data);
        }
        reader.close();
        return dataList;
    }
}

class CSVData {
    private String name;
    private String date;

    public CSVData(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}

