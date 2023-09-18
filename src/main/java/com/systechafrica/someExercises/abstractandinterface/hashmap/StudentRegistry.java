package com.systechafrica.someExercises.abstractandinterface.hashmap;

import java.util.HashMap;

public class StudentRegistry {
  private HashMap<Integer, Student> studentMap;

  public StudentRegistry() {
    studentMap = new HashMap<>();
  }

  // Add a student to the registry
  public void addStudent(int studentID, Student student) {
    studentMap.put(studentID, student);
  }

  // Retrieve a student by ID
  public Student getStudentByID(int studentID) {
    return studentMap.get(studentID);
  }

  // Remove a student from the registry
  public void removeStudent(int studentID) {
    studentMap.remove(studentID);
  }

  // Other methods for managing student records...

  // Inner Student class to store student details
  public static class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }

    // Getter methods for name and age...

    @Override
    public String toString() {
      return "Name: " + name + ", Age: " + age;
    }
  }

  public static void main(String[] args) {
    StudentRegistry registry = new StudentRegistry();

    // Add some students to the registry
    registry.addStudent(1001, new Student("Alice", 20));
    registry.addStudent(1002, new Student("Bob", 21));

    // Retrieve and print student details
    System.out.println("Student 1001: " + registry.getStudentByID(1001));
    System.out.println("Student 1002: " + registry.getStudentByID(1002));

    // Remove a student
    registry.removeStudent(1001);
    System.out.println("Student 1001 after removal: " + registry.getStudentByID(1001));
  }
}
