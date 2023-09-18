package com.systechafrica.someExercises.StaticMethodExercise;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
  static int i;
  int j;

  public static void main(String[] args) {
    // Test2 x1 = new Test2();
    // Test2 x2 = new Test2();
    // x1.i = 3;
    // x1.j = 4;
    // x2.i = 5;
    // x2.j = 6;
    // System.out.println(x1.i);
    // System.out.println(x1.j);
    // System.out.println(x2.i);

    ArrayList al = new ArrayList<>();
    al.add(true);
    al.add("Manu");
    for (Object e : al) {

    }
    Collections.sort(al, Collections.reverseOrder());
  }

}
