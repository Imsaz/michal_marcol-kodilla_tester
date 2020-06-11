package com.kodilla.collections.adv.exercises.dictonary.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightFrom() {
        //given
        FlightFinder search = new FlightFinder();
        //when
        List<Flight> listOfSearching = search.findFlightsFrom("Moscow");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Moscow", "Tokyo"));
        expectedList.add(new Flight("Moscow", "Rome"));
        assertEquals(expectedList, listOfSearching);
        assertEquals(2, listOfSearching.size());
    }

    @Test
    public void testFindFlightTo() {
        //given
        FlightFinder search = new FlightFinder();
        //when
        List<Flight> listOfSearching = search.findFlightsTo("Melbourne");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Sydney", "Melbourne"));
        assertEquals(expectedList, listOfSearching);
        assertEquals(1, listOfSearching.size());
    }
}