package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    Map<String, Boolean> airports = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {
        airports.put("Warsaw", true);
        airports.put("London", true);
        airports.put("Berlin", true);
        airports.put("Rio de Janeiro", true);
        airports.put("Chicago", true);

        String arrivalAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();

        if (airports.containsKey(departureAirport) && airports.containsKey(arrivalAirport)) {
            System.out.println("You can fly to " + arrivalAirport + " from " + departureAirport);
        } else {
            throw new RouteNotFoundException("Route from " + departureAirport + " to " + arrivalAirport + " doesn't exist");
        }
    }
}
