import org.jsoup.select.Elements;

public class MoscowMetroLines extends WebPageParsing {

    public static void getLine() {

        Elements elements = doc.getElementsByClass("js-metro-line");
        elements.forEach(element -> System.out.println(element.attr("data-line") + " - " + element.text()));
    }

}
