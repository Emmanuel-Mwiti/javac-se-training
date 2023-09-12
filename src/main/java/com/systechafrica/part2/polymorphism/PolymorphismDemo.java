package com.systechafrica.part2.polymorphism;

import com.systechafrica.part2.inheritance.employeesetup.Employee;
import com.systechafrica.part2.inheritance.employeesetup.QualityAssurrance;
import com.systechafrica.part2.inheritance.employeesetup.SoftwareEngineer;

public class PolymorphismDemo {
  public static void main(String[] args) {
    Employee emmanuel = new QualityAssurrance(null, null, null, null);
    Employee immaculate = new SoftwareEngineer(null, null, null, null);
  }
}
