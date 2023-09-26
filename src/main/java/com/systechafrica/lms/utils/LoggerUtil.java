package com.systechafrica.lms.utils;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.part3.logging.CustomFormatter;

public class LoggerUtil {
  private static final Logger LOGGER = Logger.getLogger(LoggerUtil.class.getName());

  // Configure the logger with a file handler and custom formatter
  public static void configureLogger() {
    try {
      FileHandler fileHandler = new FileHandler("log-library.txt");

      CustomFormatter formatter = new CustomFormatter();
      fileHandler.setFormatter(formatter);

      LOGGER.addHandler(fileHandler);
    } catch (IOException e) {
      LOGGER.severe("IOException thrown! ");
    }
  }

  // Log a message
  public static void logInfoMessage(String message) {
    LOGGER.info(message);
  }

  public static void logSevereMessage(String message) {
    LOGGER.severe(message);
  }

}
