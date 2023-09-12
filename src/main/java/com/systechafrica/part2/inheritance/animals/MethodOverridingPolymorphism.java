package com.systechafrica.part2.inheritance.animals;

public class MethodOverridingPolymorphism {
  public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal animal = new Animal();
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(animal);

  }

}
