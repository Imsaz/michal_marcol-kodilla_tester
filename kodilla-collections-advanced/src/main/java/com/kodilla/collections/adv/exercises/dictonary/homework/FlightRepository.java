package com.kodilla.collections.adv.exercises.dictonary.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> listOfFlights = new ArrayList<>();

        listOfFlights.add(new Flight("Warsaw","Tokyo"));
        listOfFlights.add(new Flight("Moscow","Tokyo"));
        listOfFlights.add(new Flight("Sydney","Melbourne"));
        listOfFlights.add(new Flight("San Francisco","Rome"));
        listOfFlights.add(new Flight("Moscow", "Rome"));

        return listOfFlights;
    }
}
