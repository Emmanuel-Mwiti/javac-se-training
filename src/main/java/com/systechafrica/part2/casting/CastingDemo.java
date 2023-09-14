package com.systechafrica.part2.casting;

import java.util.ArrayList;
import java.util.List;

import com.systechafrica.part2.inheritance.animals.Animal;
import com.systechafrica.part2.inheritance.animals.Cat;
import com.systechafrica.part2.inheritance.animals.Dog;

public class CastingDemo {
  public static void main(String[] args) {
    CastingDemo app = new CastingDemo();
    Animal animal = new Dog();
    // ?This is implicit upcasting- Also called narrowing
    // app.printInfo(animal);
    // ? This will print because we have the done explicit
    // ? downcasting
    Animal animal2 = new Cat();
    // app.printInfo(animal2);
    // animal.printName();
    // !This one does not compile because we have done
    // !upcasting therefore we should have printName method in the base class to be
    // !able to print in the derived class
    List<String> list = new ArrayList<>();
    if (list instanceof List) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

  public void printInfo(Animal animal) {
    // Dog dog = (Dog) animal;// ? This is now the downcating also called widening.
    // It is done explicitly
    // System.out.println(dog.printName());
    if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
      System.out.println(dog.printName());
    } else if (animal instanceof Cat) {
      Cat cat = (Cat) animal;
      System.out.println(cat.printName());
    }

  }
}
