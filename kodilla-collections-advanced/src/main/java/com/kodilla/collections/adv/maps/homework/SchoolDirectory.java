package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();

        Principal seagal = new Principal("Steven", "Seagal");
        Principal brando = new Principal("Marlon", "Brando");
        Principal diaz = new Principal("Cameron", "Diaz");

        School spoleczna = new School("Spoleczna", 20,22,24,26,23);
        School publiczna = new School("Publiczna", 21,23,25,26,27);
        School prywatna = new School("Prywatna", 10,8,13,14,7);

        schoolDirectory.put(seagal, prywatna);
        schoolDirectory.put(brando, publiczna);
        schoolDirectory.put(diaz, spoleczna);

        for(Map.Entry<Principal, School> schoolEntry: schoolDirectory.entrySet())
            System.out.println("\nImie i nazwisko dyrektora: " + schoolEntry.getKey().getFirstname() + "  "
                    + schoolEntry.getKey().getLastname()
                    + "\nNazwa szkoły: " + schoolEntry.getValue().getNameOfSchool()
                    + "\nIlosc wszystkich uczniow w szkole: " + schoolEntry.getValue().numberOfAllStudents() + "\n\n");
    }
}
