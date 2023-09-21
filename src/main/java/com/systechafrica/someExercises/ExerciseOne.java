package com.systechafrica.someExercises;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Product {
  // double price;
  int ns;
  static int s;
  float float1;
  long long1;
  int int1;
  double double1;
  char char1;

  Product() {

  }

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
    Product product = new Product();

    System.out.println("Long " + product.long1);
    System.out.println("int " + product.int1);
    System.out.println("double " + product.double1);
    System.out.println("char " + product.char1);
    // String[] strs = new String[2];
    // int idx = 0;
    // for (String s : strs) {
    // strs[idx] = "";
    // strs[idx] = strs[idx].concat(" element" + idx);
    // idx++;
    // }
    // for (idx = 0; idx < strs.length; idx++) {
    // /
  }
  // doSum(10, 20);

  // String str1 = "Java";
  // String str2 = new String("java");
  // if (str1.equalsIgnoreCase(st
  // System.o
  // } else {
  // S

  // String str
  // str.trim();

  // String[][] arr = { { "A", "B", "C" },
  // for (int i = 0; i < arr.length; i++) {
  // for (int j = 0; i < arr[i].length;
  // System.out.println(arr[i][j]
  // if (ar
  // b
  // }
  // }
  // c

  // StringBuilder sb
  // String one = "";
  // String two = sb1.toString();

  // StringBuilder sb1 = new Strin
  // String str1 = sb1.toS
  // String str2 = "Duke";

  // LocalDate date1 = LocalDate.now();
  // LocalDate date2 = LocalDate.of(2014, 6, 20);
  // LocalDate date3 = LocalDate.parse("2
  // System.out.println("date1" + date1);
  // System.out.println("date2" + date2);
  // System.out.

  // Product ref1 = new Product(50);
  // Product ref2 = new Product(125);
  // Product ref3 =
  // ref1.doPrint();
  // ref2.doPrint();

  // String[] arr = { "A", "B", "C", "D" };

  // if (arr[i
  // c
  // }
  // System.out.println(arr[i] + "");
  // System
  // b
  // }
  // X xobj = new X();

  // String date =
  // LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
  // !Does not
  // static class
  // System.out.p
  // Question one
  // Product prt = ne
  // prt.price = 200;

  // ExerciseOne t = new ExerciseO
  // t.updatePrice(prt, newPrice);

  // int avar = 9;
  // if (avar++ < 10) {
  // System.o
  // } else {
  // S
  // }
  // String date =
  // LocalDate.parse("2014-05-04").format(DateTime

  // StringBuilder
  // String s = "";
  // if (sb.equals(s)) {
  // System.out.println("Match 1");
  // } else if (sb.toString().equal
  // System.o
  // } else {
  // S
  // }

  // } catch (Exception e) {
  // /
  // }
  // finally
  // }

  // }

  // public static void doSum(Integer x, Integer y) {
  // System.out.println("Integer sum is" + (x + y));
  // }

  // public static void doSum(double x, double y) {
  // System.out.println("Dubble sum is" + (x + y));
  // }

  // public static void doSum(float x, float y) {
  // System.out.println("Float sum is" + (x + y));
  // }

  // public static void doSum(int x, int y) {
  // System.out.println("int sum is" + (x + y));
  // }

  // public static void checkSum() {
  // int i = 0;
  // int j = 7;
  // for (i = 0; i < j - 1; i = i + 2) {
  // System.out.println(i + "");
  // }
  // }
}
