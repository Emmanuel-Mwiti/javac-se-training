package com.systechafrica.part3.exceptionhandling;

import java.util.UUID;

public class StudentController {
  public void addStudent(Student student) throws StudentDetailsMissingException {
    if (student == null) {
      throw new StudentDetailsMissingException("Correct details not supplied!");
    }
    student.setId(UUID.randomUUID().toString());
  }
}
