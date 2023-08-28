package com.systechafrica.looping;

  import java.util.logging.Logger;

  public class LoopingStatements {
    private static final Logger LOGGER = Logger.getLogger(LoopingStatements.class.getName());

    public void forLoop() {
      // initialize condition update
      for (int counter = 0; counter <= 10; counter = counter + 1) {
        LOGGER.info("Count = " + counter);
      }
      for (int counter = 0; counter <= 10; counter += 1) {
        LOGGER.info("Count = " + counter);
      }
      for (int counter = 0; counter <= 10; counter++) {
        LOGGER.info("Count = " + counter);
      }
    }

    public void whileLoop() {
      int studentCount = 0;
      int count = 0;
      while (studentCount < 10) {
        LOGGER.info("Student Count = " + studentCount);
        studentCount++; // studentCount = studentCount + 1
        count++;
      }

    }

    public void doWhileLoop() {
      int myNumber = 0;
      int count = 0;

      do{
        LOGGER.info("My number is equal to: " + myNumber);
        myNumber++;
        count++;
      }
      while (myNumber < 10);
        LOGGER.info("Count is equal to: " + count);

    }

    public static void main(String[] args) {
      LoopingStatements app = new LoopingStatements();
      // app.forLoop();
      app.whileLoop();
      app.doWhileLoop();
    }
  }
