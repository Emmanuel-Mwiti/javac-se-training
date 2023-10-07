package com.systechafrica.part4.funtionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingAndMapping {
    public static void main(String[] args) {
        // mappingStudentToAnotherUsingStreams();

        // mapToIntOrDoubleWithTerminatingFunction();
        // usingReduceFunctions();

        // functionMatchers();
        // intermediaryOperations();
        List<Integer> numbers = List.of(85, 100, 225, 3955, 4485, 5, 225, 785, 100, 9, 1000);
        numbers.stream()
                .peek(System.out::println)
                .filter(x -> x % 2 == 0)
                .peek(System.out::println)
                .forEach(number -> System.out.println(" number = " + number));
    }

    private static void intermediaryOperations() {
        List<Integer> numbers = List.of(85, 100, 225, 3955, 4485, 5, 225, 785, 100, 9, 1000);
        Integer anyNumber = numbers.stream()
                .findAny().get();
        List<String> nickNames = List.of("Mhusika", "Ntate", "Yokana", "JayO");
        String anyNickName = nickNames.stream()
                .findAny().get();
        System.out.println(anyNumber);
        System.out.println("firstNickName = " + anyNickName);
        System.out.println("limiting");
        numbers.stream()
                .limit(3)

                .forEach(System.out::println);
        System.out.println("Skipping and limiting");
        numbers.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("Sorting");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("Distinct");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static void functionMatchers() {
        List<Integer> numbers = List.of(100, 225, 3955, 4485, 5, 6, 785, 8, 9, 1000);
        boolean anyMatchGreaterThanOrEqualTo1000 = numbers.stream()
                .anyMatch(number -> number >= 1000);
        boolean allMatchGreaterThanOrEqualTo1000 = numbers.stream()
                .allMatch(number -> number >= 1000);
        boolean noneMatchGreaterThanOrEqualTo1000 = numbers.stream()
                .noneMatch(number -> number >= 1000);

        System.out.println("anyMatchGreaterThanOrEqualTo1000 = " + anyMatchGreaterThanOrEqualTo1000);
        System.out.println("allMatchGreaterThanOrEqualTo1000 = " + allMatchGreaterThanOrEqualTo1000);
        System.out.println("noneMatchGreaterThanOrEqualTo1000 = " + noneMatchGreaterThanOrEqualTo1000);
    }

    private static void usingReduceFunctions() {
        List<Integer> numbers = List.of(100, 225, 3955, 4485, 5, 6, 785, 8, 9, 10000);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .reduce(0, (a, b) -> a + b);
        int sumUsingInbuiltReduce = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        int product = numbers.stream()
                .mapToInt(Integer::intValue)
                .reduce(1, (a, b) -> a * b);

        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min().getAsInt();
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max().getAsInt();
        long count = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println("sum = " + sum);
        System.out.println("sumUsingInbuiltReduce = " + sumUsingInbuiltReduce);
        System.out.println("product = " + product);
        System.out.println("min = " + min);
        System.out.println("Count even numbers = " + count);
        // System.out.println("minNormal = " + minNormal);
        System.out.println("max = " + max);
        // System.out.println("maxNormal = " + maxNormal);
    }

    private static void mapToIntOrDoubleWithTerminatingFunction() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double sum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToDouble(Integer::doubleValue)
                .sum();
        System.out.println(sum);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .forEach(System.out::println);
    }

    private static void mappingStudentToAnotherUsingStreams() {
        List<Student> students = List.of(
                new Student(1, "Tony", "tony@gmail.com", "001"),
                new Student(2, "Emmanuel", "emmanuel@gmail.com", "002"),
                new Student(3, "Len", "len@gmail.com", "003"),
                new Student(4, "Shady", "shady@gmail.com", "004"),
                new Student(5, "Deno", "deno@gmail.com", "005"),
                new Student(6, "Kiogi", "kiogi@gmail.com", "006"));
        List<StudentDto> studentsWithEvenId = students
                .stream()
                .filter(student -> student.getId() % 2 == 0)
                .map(FunctionalProgrammingAndMapping::mapToStudentDto)
                .collect(Collectors.toList());
        for (StudentDto studentDto : studentsWithEvenId) {
            System.out.println(studentDto);
        }
    }

    private static StudentDto mapToStudentDto(Student student) {
        return new StudentDto(student.getName(), student.getRegNo());
    }
}
