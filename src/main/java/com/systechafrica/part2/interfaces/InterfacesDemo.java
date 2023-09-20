package com.systechafrica.part2.interfaces;

public class InterfacesDemo {
  public static void main(String[] args) {
    ThreePinPlug mc = new MobileCharger();
    mc.plugIn();
    mc.plugOut();
    Square sq = new Square();
    System.out.println(sq.calculateArea(5, 5));
    System.out.println(sq.calculatePerimeter(5, 5));
    // Square.MY_NAME;
    System.out.println(sq.sum(2, 3));
    // System.out.println(sq.MY_NAME);
  }
}
