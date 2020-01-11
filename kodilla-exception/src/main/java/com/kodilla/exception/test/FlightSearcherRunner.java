package com.kodilla.exception.test;

public class FlightSearcherRunner {
    public static void main(String[] args) {
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight = new Flight("Warsaw", "Paris");

        try {
            flightSearcher.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using our flight searcher");
        }
    }
}
