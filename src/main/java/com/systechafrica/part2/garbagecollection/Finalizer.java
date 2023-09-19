package com.systechafrica.part2.garbagecollection;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {
  private static final List object = new ArrayList<>();

  public void finalize() {
    object.add(this);
    // ?This method might run 0 or 1 times
    System.out.println("Running finalizer method...");
  }

  public static void main(String[] args) {
    Finalizer f = new Finalizer();
    // int 12=1_2234;
  }

}
