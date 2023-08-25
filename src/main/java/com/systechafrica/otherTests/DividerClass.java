package com.systechafrica.otherTests;

public class DividerClass {
  public double divider(int dividend, int divisor) {
        if(divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be equal to zero");
        }
//        double result = dividend/divisor;
        return (double) dividend / divisor;
    }
}
