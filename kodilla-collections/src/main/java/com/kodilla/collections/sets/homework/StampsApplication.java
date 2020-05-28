package com.kodilla.collections.sets.homework;

/*TODO Review kdrzazga Redundant import & error - cannot run the app*/
import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("krakowski", 20, 50, true));
        stamps.add(new Stamp("mazowiecki", 70, 60, false));
        stamps.add(new Stamp("narodowy", 30, 40, false));
        stamps.add(new Stamp("krakowski", 20, 50, true));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps)
            System.out.println(stamp);
    }
}
