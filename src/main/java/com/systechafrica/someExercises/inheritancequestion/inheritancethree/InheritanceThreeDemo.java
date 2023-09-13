package com.systechafrica.someExercises.inheritancequestion.inheritancethree;

import java.util.ArrayList;

public class InheritanceThreeDemo {
  public static void main(String[] args) {
    ArrayList<Animal> myList = new ArrayList<>();
    myList.add(new Tiger());
    ArrayList<Hunter> myList2 = new ArrayList<>();
    myList2.add(new Cat());
    ArrayList<Hunter> myList3 = new ArrayList<>();
    myList3.add(new Tiger());
    ArrayList<Tiger> mArrayList = new ArrayList<>();
    // mArrayList.add(new Cat()); //!This one here does not compile!
    ArrayList<Animal> mArrayList2 = new ArrayList<>();
    mArrayList2.add(new Cat());
  }

}
