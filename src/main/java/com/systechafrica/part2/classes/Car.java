package com.systechafrica.part2.classes;

import java.util.logging.Logger;

public class Car {

  private static final Logger LOGGER = Logger.getLogger(Car.class.getName());
  final int ACCELERATION = 10;// ?this is in km/h assumption
  String name;
  String carNumber;
  int speed;

  public Car(String name, String carNumber, int speed) {
    this.name = name;
    this.carNumber = carNumber;
    this.speed = speed;
  }

  public void startEngine() {
    LOGGER.info("The car Engine has started..!");
  }

  public void accelerate() {
    int newSpeed = speed + ACCELERATION;
    LOGGER.info("The car has increased speed to: " + newSpeed);
  }

  public String getName() {
    return name;
  }

  public String getCarNumber() {
    return carNumber;
  }

  public int getSpeed() {
    return speed;
  }

}
