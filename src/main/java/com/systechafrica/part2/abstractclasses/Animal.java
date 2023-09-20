package com.systechafrica.part2.abstractclasses;

public abstract class Animal {

  protected String name;

  public Animal(String name) {
    this.name = name;
  }

  void eat() {
    System.out.println(name + " eats!");
  }

  abstract void makeSound();

}
