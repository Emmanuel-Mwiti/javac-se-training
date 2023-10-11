package com.systechafrica.part4.functionalprogramming;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.function.Supplier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.systechafrica.part4.funtionalprogramming.Calculator;
import com.systechafrica.part4.funtionalprogramming.Divider;

public class CalculatorTest {
    Calculator calculator = (a, b, numbers) -> {
        int sum = a + b;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    };
    Divider divider = (a, b) -> a / b;

    @Test
    @DisplayName("Test calculation using calculate method")
    public void sumTest() {
        Supplier<String> messageSupplier = () -> "Expected result should be match";
        assertAll(
                () -> assertEquals(11, calculator.calculator(5, 6), messageSupplier),
                () -> assertEquals(-4, calculator.calculator(-10, 6), messageSupplier),
                () -> assertEquals(-20, calculator.calculator(-10, -10), messageSupplier),
                () -> assertEquals(15, calculator.calculator(5, 5, 5), messageSupplier));
        // Expected result
        // Check the sum

    };

    @Test
    @DisplayName("Test divider using divide method")
    public void divideTest() {
        assertAll(
                () -> assertEquals(11, divider.divide(22, 2), "Expected result should be match, when dividing!"),
                () -> assertEquals(5, divider.divide(-20, -4), "Expected result should be match"),
                () -> assertThrows(ArithmeticException.class, () -> divider.divide(20, 0)));
    }
}
