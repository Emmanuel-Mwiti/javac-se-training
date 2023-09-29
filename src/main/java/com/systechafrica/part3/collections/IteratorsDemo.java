package com.systechafrica.part3.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorsDemo {
  public static void main(String[] args) {
    // Map<KT,VT> map;
    List<String> johnNickNames = new ArrayList<>();
    johnNickNames.add("mhusika");
    johnNickNames.add("ntate");
    johnNickNames.add("yokana");

    Iterator<String> iterator = johnNickNames.iterator();// allows forward traversal only
    System.out.println(iterator);
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      iterator.remove();
    }
    System.out.println(johnNickNames);
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    ListIterator<Integer> numIterator = numbers.listIterator(numbers.size());
    // System.out.println("Forward Traversal:");
    while (numIterator.hasPrevious()) {
      // System.out.println(numIterator.previous());
    }
    List<String> fruits = new ArrayList<>();

    // Add some fruits to the list
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");
    fruits.add("Date");
    fruits.add("Fig");

    // Create a list iterator for backward traversal
    ListIterator<String> listIterator = fruits.listIterator(fruits.size());

    // Traverse the list using backward iteration
    // System.out.println("Backward Traversal:");
    while (listIterator.hasPrevious()) {
      String fruit = listIterator.previous();
      // System.out.println(fruit);
    }
  }
}
