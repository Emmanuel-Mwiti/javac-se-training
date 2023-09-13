package com.systechafrica.someExercises;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Product {
  // double price;
  int ns;
  static int s;

  Product(int ns) {
    if (s < ns) {
      s = ns;
      this.ns = ns;
    }
  }

  void doPrint() {
    System.out.println("ns= " + ns + "s= " + s);
  }
}

// class X {
// public void printFileContent() throws IOException {
// throw new IOException(null, null);
// }
// }

public class ExerciseOne {
  // public void updatePrice(Product product, double price) {
  // price = price * 2;
  // product.price = product.price + price;
  // }

  public static void main(String[] args) throws Exception {

    String[] strs = new String[2];
    int idx = 0;
    for (String s : strs) {
      strs[idx] = "";
      strs[idx] = strs[idx].concat(" element" + idx);
      idx++;
    }
    for (idx = 0; idx < strs.length; idx++) {
      System.out.println(strs[idx]);
    }
    // doSum(10, 20);
    // doSum(10.0, 20.0);

    // String str1 = "Java";
    // String str2 = new String("java");
    // if (str1.equalsIgnoreCase(str2)) {
    // System.out.println("Equal");
    // } else {
    // System.out.println("Not Equal");
    // }

    // String str = "";
    // str.trim();
    // System.out.println(str.equals("") + " " + str.isEmpty());

    // String[][] arr = { { "A", "B", "C" }, { "D", "E" } };
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; i < arr[i].length; j++) {
    // System.out.println(arr[i][j] + "");
    // if (arr[i][j].equals("B")) {
    // break;
    // }
    // }
    // continue;
    // }

    // StringBuilder sb1 = new StringBuilder("");
    // String one = "";
    // String two = sb1.toString();
    // System.out.println(one == two);

    // StringBuilder sb1 = new StringBuilder("Duke");
    // String str1 = sb1.toString();
    // String str2 = "Duke";
    // System.out.println(str1 == str2);

    // LocalDate date1 = LocalDate.now();
    // LocalDate date2 = LocalDate.of(2014, 6, 20);
    // LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
    // System.out.println("date1" + date1);
    // System.out.println("date2" + date2);
    // System.out.println("date3" + date3);
    // checkSum();

    // Product ref1 = new Product(50);
    // Product ref2 = new Product(125);
    // Product ref3 = new Product(100);
    // ref1.doPrint();
    // ref2.doPrint();
    // ref3.doPrint();

    // String[] arr = { "A", "B", "C", "D" };
    // for (int i = 0; i < arr.length; i++) {

    // if (arr[i].equals("C")) {
    // continue;
    // }
    // System.out.println(arr[i] + "");
    // System.out.println("Work done");
    // break;
    // }
    // X xobj = new X();
    // xobj.printFileContent();

    // String date =
    // LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
    // //!Does not run because of data and time they are taking from local date
    // static class
    // System.out.println(date);
    // Question one
    // Product prt = new Product();
    // prt.price = 200;
    // double newPrice = 100;

    // ExerciseOne t = new ExerciseOne();
    // t.updatePrice(prt, newPrice);
    // System.out.println(prt.price + ": " + newPrice);

    // int avar = 9;
    // if (avar++ < 10) {
    // System.out.println(avar + "Hello World");
    // } else {
    // System.out.println(avar + "Hello universe");
    // }
    // String date =
    // LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
    // System.out.println(date); => Exception thrown

    // StringBuilder sb = new StringBuilder(5);
    // String s = "";
    // if (sb.equals(s)) {
    // System.out.println("Match 1");
    // } else if (sb.toString().equals(s.toString())) {
    // System.out.println("Match 2");
    // } else {
    // System.out.println("No Match");
    // }
    // try () {

    // } catch (Exception e) {
    // // TODO: handle exception
    // }
    // finally
    // }

  }

  public static void doSum(Integer x, Integer y) {
    System.out.println("Integer sum is" + (x + y));
  }

  public static void doSum(double x, double y) {
    System.out.println("Dubble sum is" + (x + y));
  }

  public static void doSum(float x, float y) {
    System.out.println("Float sum is" + (x + y));
  }

  public static void doSum(int x, int y) {
    System.out.println("int sum is" + (x + y));
  }

  // public static void checkSum() {
  // int i = 0;
  // int j = 7;
  // for (i = 0; i < j - 1; i = i + 2) {
  // System.out.println(i + "");
  // }
  // }
}
