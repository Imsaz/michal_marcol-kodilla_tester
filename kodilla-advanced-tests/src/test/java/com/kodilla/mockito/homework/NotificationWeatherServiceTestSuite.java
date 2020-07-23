package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
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

    @Test
    public void notSubscribedClientShouldNotReceiveNotificationWeather() {
       notificationWeatherService.sendMessageToEveryone(notificationWeather);
        Mockito.verify(clientOfWService, Mockito.never()).receive(notificationWeather);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        notificationWeatherService.addClient(destination,clientOfWService);

        notificationWeatherService.sendMessageToEveryone(notificationWeather);
        Mockito.verify(clientOfWService, Mockito.times(1)).receive(notificationWeather);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        ClientOfWService secondClient = Mockito.mock(ClientOfWService.class);
        ClientOfWService thirdClient = Mockito.mock(ClientOfWService.class);
        Destination destination1 = Mockito.mock(Destination.class);
        Destination destination2 = Mockito.mock(Destination.class);
        notificationWeatherService.addClient(destination, secondClient);
        notificationWeatherService.addClient(destination1, thirdClient);
        notificationWeatherService.addClient(destination2, clientOfWService);

        notificationWeatherService.sendMessageToEveryone(notificationWeather);
        Mockito.verify(clientOfWService, Mockito.times(1)).receive(notificationWeather);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notificationWeather);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notificationWeather);
    }

    @Test
    public void notificationShouldBeSentOnlyToDestinationSubscribedClients() {
        ClientOfWService secondClient = Mockito.mock(ClientOfWService.class);
        ClientOfWService thirdClient = Mockito.mock(ClientOfWService.class);
        Destination destination1 = Mockito.mock(Destination.class);
        Destination destination2 = Mockito.mock(Destination.class);
        notificationWeatherService.addClient(destination, secondClient);
        notificationWeatherService.addClient(destination1, thirdClient);
        notificationWeatherService.addClient(destination2, clientOfWService);

        notificationWeatherService.sendMessageToGroupOfClients(destination1, notificationWeather);
        Mockito.verify(clientOfWService, Mockito.never()).receive(notificationWeather);
        Mockito.verify(secondClient, Mockito.never()).receive(notificationWeather);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notificationWeather);
    }

    @Test
    public void removeSubscribeNotSentNotification() {
        notificationWeatherService.addClient(destination, clientOfWService);
        notificationWeatherService.removeSubscribe(destination, clientOfWService);
        notificationWeatherService.sendMessageToGroupOfClients(destination, notificationWeather);
        Mockito.verify(clientOfWService, Mockito.never()).receive(notificationWeather);
    }

    @Test
    public void shouldRemoveRecord() {
        notificationWeatherService.addClient(destination, clientOfWService);
        notificationWeatherService.removeDestination(destination);
        assertEquals(0, notificationWeatherService.sizeOfMap());
    }

    @Test
    public void shouldRemoveClientFromDestination() {
        notificationWeatherService.addClient(destination, clientOfWService);
        notificationWeatherService.removeClient(clientOfWService);
        assertEquals(0, notificationWeatherService.sizeOfSet(destination));
    }


}
