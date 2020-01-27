package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {
    private String from;
    private String to;
    private String through;

    public Flight(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public Flight(String from, String to, String through) {
        this.from = from;
        this.to = to;
        this.through = through;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String toString() {
        if (this.through != null) {
            return from + " -> " + to + " through " + through;
        }
        return from + " -> " + to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
