package com.example.HelloSpring.Services;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class IsItFridayService {

    public String isItFriday() {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.FRIDAY) {
            return "Ja";
        } else return "Nej";
    }
}
