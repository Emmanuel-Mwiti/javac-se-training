package com.systechafrica.part3.logging;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
  @Override
  public String format(LogRecord record) {
    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String method = record.getSourceMethodName();
    String message = record.getMessage();
    String level = record.getLevel().getName();// ! Warning, info or severe
    Instant instant = record.getInstant();// ! The timestamp when the log message was generated
    LocalDateTime now = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

    return pattern.format(now)  + " | " + method + " | " + level + " | " + message;
  }

}
