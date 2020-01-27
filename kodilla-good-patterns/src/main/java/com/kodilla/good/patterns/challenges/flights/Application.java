package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightsSystem flightsSystem = new FlightsSystem();
        flightsSystem.addFlight(new Flight("Wrocław", "Kraków"));
        flightsSystem.addFlight(new Flight("Wrocław", "Warszawa"));
        flightsSystem.addFlight(new Flight("Warszawa", "Gdańsk"));

        System.out.println(flightsSystem.getFlightsFromCity("Wrocław"));
        System.out.println(flightsSystem.getFlightsToCity("Warszawa"));
        System.out.println(flightsSystem.getConnectingFlight("Wrocław", "Gdańsk"));
    }
}
