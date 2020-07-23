package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotificationWeatherService {

    private Map<Destination, Set<ClientOfWService>> dataBase = new HashMap<>();

    public void addClient(Destination destination, ClientOfWService client){
        if(dataBase.containsKey(destination)){
            dataBase.get(destination).add(client);
        }

        else{
            Set<ClientOfWService> exaSet = new HashSet<>();
            exaSet.add(client);
            dataBase.put(destination, exaSet);
        }

    }

    public void removeDestination(Destination destination){
        this.dataBase.remove(destination);
    }

    public void removeClient(ClientOfWService client){
        this.dataBase.values().stream().forEach(clients -> clients.remove(client));
    }

    public void removeSubscribe( Destination destination, ClientOfWService client){
        if(dataBase.containsKey(destination)){
            dataBase.get(destination).remove(client);
            /*for(Set<ClientOfWService> list: dataBase.values()){
                if(list.contains(client)){
                    list.remove(client);
                }
            }*/
        }
    }

    public void sendMessageToEveryone(NotificationWeather notification){
        for(Set<ClientOfWService> list: dataBase.values()){
           // for(ClientOfWService client: list){
           //    client.receive(notification);
           // }
            list.stream().forEach(client -> client.receive(notification));
        }
    }

    public void sendMessageToGroupOfClients(Destination destination, NotificationWeather notification){
        if(dataBase.containsKey(destination)){
            dataBase.get(destination).stream().forEach(clients -> clients.receive(notification));
        }
    }

    public int sizeOfMap(){
        return this.dataBase.size();
    }

    public int sizeOfSet(Destination destination){
        return this.dataBase.get(destination).size();
    }
}
