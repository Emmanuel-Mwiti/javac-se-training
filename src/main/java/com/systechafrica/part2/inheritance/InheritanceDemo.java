package com.systechafrica.part2.inheritance;

import java.util.logging.Logger;

import com.systechafrica.part2.inheritance.employeesetup.QualityAssurrance;
import com.systechafrica.part2.inheritance.employeesetup.SoftwareEngineer;

public class InheritanceDemo {
  private static final Logger LOGGER = Logger.getLogger(InheritanceDemo.class.getName());

  public static void main(String[] args) {
    InheritanceDemo app = new InheritanceDemo();
    app.employeeSetUp();

  }

  void employeeSetUp() {
    SoftwareEngineer s1 = new SoftwareEngineer();
    s1.setEmployeeAdress("21-Kasarani");
    s1.setEmployeeName("Emmanuel");
    s1.setEmployeeNumber("109");
    s1.setTitle("Software Engineer");

    LOGGER.info(s1.toString());

    QualityAssurrance q1 = new QualityAssurrance();
    q1.setEmployeeAdress("50-Westlands");
    q1.setEmployeeName("Immaculate");
    q1.setEmployeeNumber("115");
    q1.setTitle("Software Engineer in test");

    QualityAssurrance q2 = new QualityAssurrance();
    q2.setEmployeeAdress("50-Westlands");
    q2.setEmployeeName("Halkano");
    q2.setEmployeeNumber("100");
    q2.setTitle("Software Engineer in test");

    LOGGER.info(q1.toString());
    LOGGER.info(q2.toString());

  }
}
