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
        Flight arrive = flights.stream()
                .filter(flight -> flight.getTo().equals(to))
                .findAny()
                .orElse(new Flight("", ""));
        Flight depart = flights.stream()
                .filter(flight -> flight.getFrom().equals(from) && flight.getTo().equals(arrive.getFrom()))
                .findAny()
                .orElse(new Flight("", ""));
        if (depart.getTo().equals(arrive.getFrom())) {
            return new Flight(from, to, arrive.getFrom());
        }
        return new Flight("", "");
    }
}
