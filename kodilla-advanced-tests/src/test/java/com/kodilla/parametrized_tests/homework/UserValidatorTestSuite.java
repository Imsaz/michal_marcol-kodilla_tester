package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Maks", "karol1", "aNeTa15._-", "Sa_-.l3m"})
    public void shouldReturnTrueForProperlyUsername(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"@@aks", "    ", "$reks$@", "~efe//"})
    public void shouldReturnFalseForNotProperlyUsername(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Mi9@wp.pl", "mi9@wp.pl", "MI9@wp.pl", "Kar1@onet.com.pl"})
    public void shouldReturnTrueForProperlyEmails(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Mi#9@wp.pl", " ", "$%^.pl", "kodilla"})
    public void shouldReturnFalseForNotProperlyEmails(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

}