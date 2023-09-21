package com.systechafrica.part3.exceptionhandling;

import java.util.UUID;

public class StudentController {
  public void addStudents(Student student) {
    student.setId(UUID.randomUUID().toString());
  }
}
