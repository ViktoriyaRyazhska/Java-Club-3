package com.web.club3.util;

import java.time.LocalDate;
import java.time.Period;

public class DateUtil {
    public static LocalDate localDate = LocalDate.now();

    public static String differenceBetweenTwoDates(LocalDate neededDate, LocalDate currentDate) {
        return String.valueOf(Period.between(neededDate, currentDate).getDays());
    }
}
