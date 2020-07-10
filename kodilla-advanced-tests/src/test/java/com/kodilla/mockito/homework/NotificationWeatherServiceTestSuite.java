package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationWeatherServiceTestSuite {

    NotificationWeatherService notificationWeatherService = new NotificationWeatherService();
    Destination destination = Mockito.mock(Destination.class);
    ClientOfWService clientOfWService = Mockito.mock(ClientOfWService.class);
    NotificationWeather notificationWeather = Mockito.mock(NotificationWeather.class);

    @Test
    public void shouldAddRecord() {
        notificationWeatherService.addClient(destination, clientOfWService);
        assertEquals(1, notificationWeatherService.sizeOfMap());
    }

}
