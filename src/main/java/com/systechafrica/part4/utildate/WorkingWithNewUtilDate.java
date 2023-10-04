package com.systechafrica.part4.utildate;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class WorkingWithNewUtilDate {
  public static void main(String[] args) {
    LocalDate tLocalDate = LocalDate.now();
    // System.out.println(tLocalDate);
    tLocalDate = tLocalDate.plusDays(10).plusYears(2);
    System.out.println(tLocalDate);
    LocalDateTime datesTimeOne = LocalDateTime.of(LocalDate.of(2021, 1, 20), LocalTime.of(5, 15)).minusDays(1)
        .minusHours(3).minusSeconds(10);
    System.out.println(datesTimeOne);
    Period period = Period.ofMonths(1);
    // performAnimalEnrichment(LocalDate.of(2015, Month.JANUARY, 1),
    // LocalDate.of(2015, Month.MARCH, 30), period);
    System.out.println(datesTimeOne.getDayOfMonth());
    System.out.println(datesTimeOne.getHour());
    // ? Formatting the date and Time
    DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    LocalTime time = LocalTime.now();
    // System.out.println(shortDateTime.format(datesTimeOne));
    System.out.println(shortDateTime.format(time));
  }

  static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
    LocalDate upto = start;
    while (upto.isBefore(end)) {
      System.out.println("Give new toy: " + upto);
      upto = upto.plus(period);
    }
  }
}
