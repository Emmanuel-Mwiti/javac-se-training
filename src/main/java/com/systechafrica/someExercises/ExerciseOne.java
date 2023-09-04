package com.systechafrica.someExercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Product {
  double price;
}

public class ExerciseOne {
  public void updatePrice(Product product, double price) {
    price = price * 2;
    product.price = product.price + price;
  }

  public static void main(String[] args) {
    // Question one
    // Product prt = new Product();
    // prt.price = 200;
    // double newPrice = 100;

    // ExerciseOne t = new ExerciseOne();
    // t.updatePrice(prt, newPrice);
    // System.out.println(prt.price + ": " + newPrice);

    // int avar = 9;
    // if(avar++<10){
    // System.out.println(avar + "Hello World");
    // }
    // else{
    // System.out.println(avar + "Hello universe");
    // }
    // String date =
    // LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
    // System.out.println(date); => Exception thrown

    // StringBuilder sb = new StringBuilder(5);
    // String s = "";
    // if (sb.equals(s)) {
    // System.out.println("Match 1");
    // }
    // else if (sb.toString().equals(s.toString())) {
    // System.out.println("Match 2");
    // }
    // else {
    // System.out.println("No Match");
    // }
    // try () {

    // } catch (Exception e) {
    // // TODO: handle exception
    // }
    // finally
    // }

  }
}
