package com.kodilla.exception.flight;

import java.util.HashMap;
import java.util.Map;

public class RouteSearcher {
    public boolean findFlight(Flight flight) {
        Map<String, Boolean> possibleDepartureAirports = new HashMap<>();
        possibleDepartureAirports.put("Gdansk", true);
        possibleDepartureAirports.put("Poznan", false);
        possibleDepartureAirports.put("Katowice", false);
        possibleDepartureAirports.put("Wroclaw", true);
        possibleDepartureAirports.put("Rzeszow", true);

        try {
            if (possibleDepartureAirports.get(flight.getDepartureAirport())) {
                System.out.println("Flight is possible");
            } else {
                System.out.println("Flight is impossible");
            }
        } catch (Exception e) {
            System.out.println("There is a problem: " + new RouteNotFoundException().exceptionInfo());
        }
        return possibleDepartureAirports.get(flight.getDepartureAirport());
    }
}
