package com.systechafrica.part4.funtionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionsDemo {
    public static void main(String[] args) {
        Function<Student, Boolean> comparison = student -> student.getName().equals("emmanuel");

        Student student = new Student(1, "Tony", "dummy@gmail.com", "001");
        Student student2 = new Student(2, "tony", "mackrine@gmail.com", "002");
        System.out.println(comparison.apply(student));

        BiFunction<Student, Student, Boolean> compareStudents = (studentOne, studentTwo) -> studentOne.getName()
                .equalsIgnoreCase(studentTwo.getName());
        System.out.println(compareStudents.apply(student, student2));
    }
}
