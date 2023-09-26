package com.systechafrica.part3.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorkingWithCollection {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    // printStudentListDetails(students);
    // System.out.println(students.size());
    // System.out.println("After removing Natalia object");
    // printStudentListDetails(students);
    // System.out.println(students.size());

    Set<Student> studentsNowInSet = new HashSet<>();
    Student emmanuel = new Student("Emmanuel", "001", "emmanuel@gmail.com");
    Student natalia = new Student("Emmanuel", "001", "emmanuel@gmail.com");
    Student john = new Student("John", "002", "john@gmail.com");
    studentsNowInSet.add(emmanuel);
    studentsNowInSet.add(john);
    studentsNowInSet.add(natalia);
    studentsNowInSet.add(natalia);

    printStudentSetDetails(studentsNowInSet);
  }

  public static void printStudentListDetails(List<Student> students) {

    Student emmanuel = new Student("Emmanuel", "001", "emmanuel@gmail.com");
    Student natalia = new Student("Emmanuel", "001", "emmanuel@gmail.com");
    Student john = new Student("John", "002", "john@gmail.com");
    students.add(emmanuel);
    students.add(john);
    students.add(natalia);
    students.add(natalia);
    for (Student student : students) {
      System.out.println(student);
    }
  }

  public static void printStudentSetDetails(Set<Student> students) {
    for (Student student : students) {
      System.out.println(student);

    }
  }

}
