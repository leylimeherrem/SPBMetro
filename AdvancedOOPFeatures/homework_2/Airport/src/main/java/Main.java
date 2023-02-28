import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        List<Flight> flights = findPlanesLeavingInTheNextTwoHours(airport);
        System.out.println("Flights leaving in the next two hours:");
        flights.forEach(System.out::println);

    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        Date now = new Date();
        Date twoHoursLater = new Date(now.getTime() + 2 * 60 * 60 * 1000L);
        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream())
                .filter(flight -> flight.getType() == Flight.Type.DEPARTURE && flight.getDate().after(now) && flight.getDate().before(twoHoursLater))
                .collect(Collectors.toList());
    }

}