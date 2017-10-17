package com.kodilla.exception.flight;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RouteSearcherTestSuite {
    Flight GdnWaw = new Flight("Gdansk", "Warszawa");
    Flight PozWaw = new Flight("Poznan", "Warszawa");
    Flight SzWaw = new Flight("Szczecin", "Warszawa");

    @Test
    public void testFlightPossible() {
        //Given
        RouteSearcher routeSearcher = new RouteSearcher();
        //When
        boolean flightGdnWaw = routeSearcher.findFlight(GdnWaw);
        //Then
        Assert.assertEquals(true, flightGdnWaw);
    }

    @Test
    public void testFlightImpossible() {
        //Given
        RouteSearcher routeSearcher = new RouteSearcher();
        //When
        boolean flightPozWaw = routeSearcher.findFlight(PozWaw);
        //Then
        Assert.assertEquals(false, flightPozWaw);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testFlightNotExist() {
        //Given
        thrown.expect(Exception.class);
        RouteSearcher routeSearcher = new RouteSearcher();
        //When
        routeSearcher.findFlight(SzWaw);
        //Then
        Assert.fail();
    }
}
