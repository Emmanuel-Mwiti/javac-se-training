package com.systechafrica.someExercises.exceptions;

import java.io.IOException;

public class CheckingException {
  void readCard(int cardNo) throws Exception {
    System.out.println("Reading card");
  }

  void helloThere() throws IOException {
    System.out.println("Hello there");
  }

  void checkCard(int cardNo) throws RuntimeException {
    System.out.println("Checking card");
  }

  public static void main(String[] args) {
    CheckingException ex = new CheckingException();
    String a = "abcd";
    String b = "abcd123";
    String c = a + "123";
    System.out.println(b == c);
    // final Integer i = 7;
    // String name = "manu";
    // String sum = i + name;
    // System.out.println(sum);
    // // ex.checkCard(101);
    // ex.checkCard(10);

    // int cardNo = 12344;
    // ex.checkCard(cardNo);
    // // // ex.helloThere();
    // ex.helloThere();
    // try {
    // ex.helloThere();
    // ex.readCard(cardNo);
    // } catch (Exception e) {
    // }
    // ;
    // int x = 5;
    // while (isAvailable(x)) {
    // --x;
    // System.out.println(x);
    // }
    // }

    // public static boolean isAvailable(int x) {
    // return x-- > 0 ? true : false;

    // String opt = "true";
    // switch (opt) {
    // case "true":
    // System.out.println("True");
    // break;
    // default:
    // System.out.println("****");
    // }
    // System.out.println("Done");
    // int num = 5;
    // do {
    // System.out.println(num-- + "");
    // } while (num == 0);
    // int x = 100;
    // int a = x++;
    // int b = ++x;
    // int c = x++;
    // int d = (a < b) ? (a < c) ? a : c : (b < c) ? b : c;
    // System.out.println(d);

    // int arry1[][] = new int[3][3];
    // arry1[0][0] = 1;
    // arry1[0][1] = 2;
    // arry1[1][0] = 3;
    // arry1[1][1] = 4;
    // for (int i = 0; i < arry1.length; i++) {
    // for (int j = 0; j < arry1.length; j++) {
    // System.out.println(arry1[i][j]);
    // }
    // }
    // String[][] chs = new String[2][];
    // chs[0] = new String[2];
    // chs[1] = new String[5];
    // int i = 97;

    // for (int a = 0; a < chs.length; a++) {
    // for (int b = 0; b < chs.length; b++) {
    // chs[a][b] = "" + i;
    // i++;
    // }
    // }
    // for (String[] strings : chs) {
    // for (String strings2 : strings) {
    // System.out.print(strings2 + " ");

    // }
    // System.out.println();

    // }
  }

}
