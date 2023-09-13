package com.systechafrica.someExercises.constructors;

class Planet {
  public String name;
  public int moons;

  Planet(String name, int moons) {
    this.name = name;
    this.moons = moons;

  }

  public static void main(String[] args) {
    // Planet[] planets = { new Planet("Mercury", 0), new Planet("Venus", 0), new
    // Planet("Earth", 1),
    // new Planet("Mars", 2) };
    // System.out.println(planets);
    // System.out.println(planets[2]);
    // System.out.println(planets[2].moons);
    int var1 = 200;
    System.out.println(doCalc(var1));
    System.out.println(" " + var1);

  }

  static int doCalc(int var1) {
    var1 = var1 * 2;
    return var1;
  }
}

public class Chaining {
  public Chaining() {
    System.out.println("I am default");

  }

  public Chaining(int x) {
    this();

  }

  public Chaining(int x, int y) {
    this(x);

  }

  public static void main(String[] args) {
    Chaining chaining = new Chaining(10, 20);

  }

}
