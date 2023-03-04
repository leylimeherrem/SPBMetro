import core.Line;
import core.Station;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RouteCalculatorTests extends TestCase {
    private static final String DATA_FILE = "ExceptionsDebuggingAndTesting/homework_2/SPBMetro/src/main/resources/map.json";

    @Test
    public void testGetShortestRoute() {
        // Create station index and calculator
        StationIndex stationIndex = new StationIndex();
        RouteCalculator calculator = new RouteCalculator(stationIndex);

        // Create stations for the test
        Station from = stationIndex.getStation("Площадь Мужества");
        Station to = stationIndex.getStation("Владимирская");

        // Expected route
        List<Station> expectedRoute = new ArrayList<>();
        expectedRoute.add(stationIndex.getStation("Площадь Мужества"));
        expectedRoute.add(stationIndex.getStation("Лесная"));
        expectedRoute.add(stationIndex.getStation("Выборгская"));
        expectedRoute.add(stationIndex.getStation("Площадь Ленина"));
        expectedRoute.add(stationIndex.getStation("Чернышевская"));
        expectedRoute.add(stationIndex.getStation("Площадь Восстания"));
        expectedRoute.add(stationIndex.getStation("Владимирская"));

        // Actual route
        List<Station> route = calculator.getShortestRoute(from, to);

        // Check that the route is correct
        Assert.assertEquals(expectedRoute, route);
    }



    @Test
    public void testCalculateDuration() {
        Line line1 = new Line(1, "Первая");
        Station station1 = new Station("Станция 1", line1);
        Station station2 = new Station("Станция 2", line1);
        Station station3 = new Station("Станция 3", line1);

        List<Station> route = new ArrayList<>();
        route.add(station1);
        route.add(station2);
        route.add(station3);

        double expectedDuration = 2 * 2.5; // 2 промежутка по 2.5 минуты
        double actualDuration = RouteCalculator.calculateDuration(route);

        assertEquals(expectedDuration, actualDuration, 0.0); // убедимся, что значение совпадает с точностью до 0.0
    }


}
