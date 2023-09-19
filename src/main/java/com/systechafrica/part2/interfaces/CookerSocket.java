package com.systechafrica.part2.interfaces;

public class CookerSocket implements ThreePinPlug {

  @Override
  public boolean plugIn() {
    System.out.println("Cooker charger connected");
    return true;
  }

  @Override
  public boolean plugOut() {
    System.out.println("Cooker charger disconnected");
    return true;
  }

}
