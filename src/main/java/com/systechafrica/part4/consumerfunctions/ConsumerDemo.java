package com.systechafrica.part4.consumerfunctions;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConsumerDemo {
    public static void main(String[] args) {
        // ? Consumers are terminating functions meaning they do not return a value
        normalEvaluation();

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> printInfo(a, b);
        biConsumer.accept(4, 5);
        //? Predicate returns a value that is boolean

    }

    private static void printInfo(Integer a, Integer b) {
        System.out.println(a + b);
    }

    private static void normalEvaluation() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Stream<Integer> numbersStream = numbers.stream();

        Predicate<Integer> isEven = number -> number % 2 == 0;
        Stream<Integer> evenNumbers = numbersStream.filter(isEven);
        // System.out.println();
        // // evenNumbers.forEach(System.out.println("Tony"));
        // Consumer<? super Integer> action = number -> System.out.println(number);
        // // evenNumbers.forEach(action);
        // System.out.println();
    }
}
