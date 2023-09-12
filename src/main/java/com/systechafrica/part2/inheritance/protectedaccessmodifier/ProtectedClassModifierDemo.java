package com.systechafrica.part2.inheritance.protectedaccessmodifier;

import com.systechafrica.part2.inheritance.protectedaccessmodifier.nomenclature.kingdom.Kingdom;

public class ProtectedClassModifierDemo {
  public static void main(String[] args) {

    Kingdom newKingdom = new Kingdom();
    // newKingdom.sampleMethod(); //!Does not compile

  }

}
