package com.systechafrica.part2.inheritance.protectedaccessmodifier.nomenclature.kingdom;

public class Random {

  // !This one is accessible in the same package
  public void sample() {
    Kingdom newKingdom = new Kingdom();
    newKingdom.randomString = "";
  }
}
