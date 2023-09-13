package com.systechafrica.someExercises.constructors;

public class MarkList {
  int num;

  public static void graceMakrs(MarkList obj4) {
    // MarkList obj1 = new MarkList();
    // MarkList obj2 = obj1;
    // MarkList obj3 = null;
    // obj2.num = 60;
    // graceMakrs(obj2);

  }

  public static void main(String[] args) {
    // int x = 1;
    // switch (x) {
    // case 1:
    // System.out.println(x);
    // break;
    // case 2:
    // System.out.println();
    // break;
    // }
    Boolean[] bool = new Boolean[2];
    bool[0] = new Boolean(Boolean.parseBoolean("true"));
    bool[1] = new Boolean(null);
    System.out.println(bool[0]);
    System.out.println(bool[1]);
  }

}
