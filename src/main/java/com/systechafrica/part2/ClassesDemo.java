package com.systechafrica.part2;

import java.util.List;
import java.util.ArrayList;

public class ClassesDemo {
  public static void main(String[] args) {
    ClassesDemo app = new ClassesDemo();
    // List<Intern> internsList = app.createInterns();
    // app.displayInterns(internsList);

    List<Car> cars = app.createCars();
    app.displayCars(cars);

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

  public List<Car> createCars() {
    List<Car> carsList = new ArrayList<>();
    Car tx = new Car("Tx", "KAC543H", 80);
    carsList.add(tx);
    Car audi = new Car("Audi", "KBC543H", 70);
    carsList.add(audi);
    Car ford = new Car("Ford", "KBYY00Y", 50);
    carsList.add(ford);
    Car chevrolet = new Car("Chevrolet", "KCA127U", 90);
    carsList.add(chevrolet);
    Car bmw = new Car("BMW", "KAC543H", 78);
    carsList.add(bmw);
    Car subaru = new Car("Subaru", "KAC543H", 100);
    carsList.add(subaru);
    Car toyota = new Car("Toyota", "KAC543H", 40);
    carsList.add(toyota);
    Car nissan = new Car("Nissan", "KAC543H", 70);
    carsList.add(nissan);
    Car honda = new Car("Honda", "KAC543H", 100);
    carsList.add(honda);

    return carsList;
  }

  public void displayCars(List<Car> listOfCars) {
    for (Car car : listOfCars) {
      System.out.println("Name:" + car.getName());
      System.out.println("Name:" + car.getCarNumber());
      System.out.println("Speed:" + car.getSpeed());
      System.out.println("------------------------------");
    }

  }

}
