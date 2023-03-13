import org.jsoup.select.Elements;

import java.util.ArrayList;

public class MoscowMetroStations extends WebPageParsing {

    public static void getStation() {
        ArrayList lines = new ArrayList();
        Elements elements1 = doc.getElementsByClass("js-metro-stations");
        elements1.forEach(element -> lines.add(element.attr("data-line")));
        for (int i = 0; i < lines.size() ; i++) {
            String elementForSearch = "[data-line=" +'"'+ lines.get(i) + '"' +"] [class=" +'"'+"name"+'"'+"]";
            Elements elements2=doc.select(elementForSearch);
            for (int j = 0; j < elements2.size(); j++) {
                System.out.println(elements2.get(j).text() + ". Линия : " +lines.get(i));
            }
        }
    }

}
