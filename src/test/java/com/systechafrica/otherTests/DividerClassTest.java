package com.systechafrica.otherTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DividerClassTest {

  DividerClass dividerClass = new DividerClass();
  @Test
  void testWhenDividendByNonZero() {
    double result = dividerClass.divider(10, 2);
    assertEquals(5.0, result, "Answer should be 5");

  }
  @Test
    void testIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,()->{
            dividerClass.divider(10,0);
        });
    }
}
