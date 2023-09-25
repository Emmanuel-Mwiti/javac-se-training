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
    String str1 = "Hello";
    StringBuilder str2 = new StringBuilder("Hello");
    boolean areEqual = str1.equals(str2); // false (compares references)
    // boolean areSameReference = str1 == str2; // false (compares references)
    Integer a = 10;
    int c = 10;
    String b = "Hello";
    if (a.equals(b)) {

    }
    if (a == c) {
      System.out.println(b);

    }
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
