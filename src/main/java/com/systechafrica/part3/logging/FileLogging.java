package com.systechafrica.part3.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class FileLogging {
  private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

  public static void main(String[] args) throws SecurityException, IOException {
    FileHandler handler = new FileHandler("log.txt");
    CustomFormatter customFormatter = new CustomFormatter();
    LOGGER.addHandler(handler);
    handler.setFormatter(customFormatter);

    LOGGER.info("Info message logging\n");
    LOGGER.severe("Error message logging\n");
    LOGGER.warning("Warning message logging\n");
    test();
  }

  public static void test() {
    LOGGER.info("Info message logging test\n");
    LOGGER.severe("Error message logging test\n");
    LOGGER.warning("Warning message logging test\n");
  }

}
