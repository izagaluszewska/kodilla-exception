package com.kodilla.exception.flight;

public class Application {
    public static void main(String[] args) {
        Flight GdnWaw = new Flight("Gdansk", "Warszawa");
        Flight PozWaw = new Flight("Poznan", "Warszawa");
        Flight KatWaw = new Flight("Katowice", "Warszawa");
        Flight WroWaw = new Flight("Wroclaw", "Warszawa");
        Flight RzeWaw = new Flight("Rzeszow", "Warszawa");
        Flight SzWaw = new Flight("Szczecin", "Warszawa");

        RouteSearcher routeSearcher = new RouteSearcher();

        routeSearcher.findFlight(GdnWaw);
        routeSearcher.findFlight(PozWaw);
        routeSearcher.findFlight(KatWaw);
        routeSearcher.findFlight(WroWaw);
        routeSearcher.findFlight(RzeWaw);
        routeSearcher.findFlight(SzWaw);
    }
}
