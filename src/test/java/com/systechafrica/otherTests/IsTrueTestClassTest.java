package com.systechafrica.otherTests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsTrueTestClassTest {
  @Test
    void testIsEvenWithEvenNumber() {
        IsTrueTestClass calculator = new IsTrueTestClass();
        assertTrue(calculator.isEven(4),"Should give an even number");
    }

    @Test
    void testIsEvenWithOddNumber() {
        IsTrueTestClass calculator = new IsTrueTestClass();
        assertFalse(calculator.isEven(7),"Should give an odd number");
  }
}
