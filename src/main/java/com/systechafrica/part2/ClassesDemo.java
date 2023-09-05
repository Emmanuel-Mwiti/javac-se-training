package com.systechafrica.part2;

import java.util.List;
import java.util.ArrayList;

public class ClassesDemo {
  public static void main(String[] args) {
    ClassesDemo app = new ClassesDemo();
    List<Intern> internsList = app.createInterns();
    app.displayInterns(internsList);

  }

  public List<Intern> createInterns() {
    List<Intern> internList = new ArrayList<>();

    Intern emmanuel = new Intern("Emmanuel", "0758345103", "kiuguemmanu@gmail.com");
    internList.add(emmanuel);

    Intern hezzy = new Intern("Hezzy", "0710201742", "hezzy12@gmail.com");
    internList.add(hezzy);

    Intern shady = new Intern("Shady", "07102093782", "shady45@gmail.com");
    internList.add(shady);

    Intern len = new Intern("Len", "07893893782", "leny90@gmail.com");
    internList.add(len);

    return internList;
  }

  public void displayInterns(List<Intern> internList) {
    for (Intern intern : internList) {
      System.out.println("Name: " + intern.getName());
      System.out.println("Phone Number: " + intern.getPhoneNumber());
      System.out.println("Email: " + intern.getEmail());
      System.out.println("------------------------------");
      intern.attendClass();
      intern.doAssignment();
    }
  }

}
