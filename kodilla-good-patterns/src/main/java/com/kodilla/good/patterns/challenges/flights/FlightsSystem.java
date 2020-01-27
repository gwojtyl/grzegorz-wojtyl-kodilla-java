package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsSystem {
    List<Flight> flights;

    public FlightsSystem() {
        flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Flight> getFlightsFromCity(String city) {
        return flights.stream().filter(flight -> flight.getFrom().equals(city)).collect(Collectors.toList());
    }

    public List<Flight> getFlightsToCity(String city) {
        return flights.stream().filter(flight -> flight.getTo().equals(city)).collect(Collectors.toList());
    }

    public Flight getConnectingFlight (String from, String to) {
        Flight start = flights.stream().filter(flight -> flight.getFrom().equals(from)).findAny().orElse(null);
        Flight stop = flights.stream().filter(flight -> flight.getTo().equals(to)).findAny().orElse(null);
        try {
            if (start.getTo().equals(stop.getFrom())) {
                return new Flight(from, to, stop.getFrom());
            }
        } catch (NullPointerException e) {
            System.out.println("Flight from " + from + " to " + to + " does not exist");
        }
        return new Flight("", "");
    }
}
