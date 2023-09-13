package com.systechafrica.someExercises.StaticMethodExercise;

public class Test {
  static int count = 0;
  int i = 0;

  public void changeCount() {
    while (i < 5) {
      i++;
      count++;
    }
  }

  public static void main(String[] args) {
    // Test check1 = new Test();
    // Test check2 = new Test();
    // check1.changeCount();
    // check2.changeCount();
    // System.out.println(check1.count + ":" + check2.count);

    // double discount = 0;
    // int qty = Integer.parseInt(args[0]);
    // int qty = 90;
    // if (qty >= 90) {
    // discount = 0.5;
    // System.out.println("0.5");
    // }
    // if (qty > 80 && qty < 90) {
    // discount = 0.2;
    // System.out.println("0.2");
    // // }
    // discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
    // System.out.println(discount);
    String[] planets = { "Mercry", "Venus", "Earth", "Mars" };
    System.out.println(planets.length);
    System.out.println(planets[1].length());
  }

}
