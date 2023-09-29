package com.systechafrica.pos.posreviewed.pos.utils;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.part3.logging.CustomFormatter;

public class LoggerUtil {
  // Configure the logger with a file handler and custom formatter
  public static void configureLogger(Logger LOGGER) {
    try {
      FileHandler fileHandler = new FileHandler("posLog.txt", true);

      CustomFormatter formatter = new CustomFormatter();
      fileHandler.setFormatter(formatter);

      LOGGER.addHandler(fileHandler);
    } catch (IOException e) {
      LOGGER.severe("IOException thrown! ");
      // e.printStackTrace();
    }
  }
}
