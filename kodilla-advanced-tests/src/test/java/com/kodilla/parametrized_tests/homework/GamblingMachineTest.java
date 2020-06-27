package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/examplesNumbersOfUserWrongUnderZero.csv")
    public void abcWrong(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> list = new HashSet<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);

        GamblingMachine gamblingMachine = new GamblingMachine();

        assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(list));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/examplesNumbersOnlyTwo.csv")
    public void abcWrongOnlyTwoExamples(int one, int two) throws InvalidNumbersException {
        Set<Integer> list = new HashSet<>();
        list.add(one);
        list.add(two);


        GamblingMachine gamblingMachine = new GamblingMachine();

        assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(list));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/examplesNumbersOutOfRange.csv")
    public void abcWrongOutOfRange(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> list = new HashSet<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);

        GamblingMachine gamblingMachine = new GamblingMachine();

        assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(list));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/examplesNumbersOfUser.csv")
    public void abc(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> list = new HashSet<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);

        GamblingMachine gamblingMachine = new GamblingMachine();

        int result = gamblingMachine.howManyWins(list);
        assertTrue(result >= 0);
        assertTrue(result <= 6);

    }

}