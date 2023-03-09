import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WebPageParsing {
    public static String htmlFile = parseFile("FilesAndNetwork/data/code.html");
    public static Document doc = Jsoup.parse(htmlFile);



    public static String parseFile(String path) {
        StringBuilder builder = new StringBuilder();

        try {

            List<String> lines = Files.readAllLines(Paths.get(path));
            lines.forEach(line -> builder.append(line + "\n"));

        } catch (Exception exception) {
            exception.printStackTrace();
        }


        return builder.toString();

    }

}

