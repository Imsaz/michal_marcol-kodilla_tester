package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Component
@Scope("prototype")
public class Clock {
    LocalTime clock = LocalTime.now();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clock)) return false;
        Clock clock1 = (Clock) o;
        return Objects.equals(clock, clock1.clock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clock);
    }

    public LocalTime returnTime(){
        return clock;
    }
    public void time(){
        System.out.println(clock);
    }
}
