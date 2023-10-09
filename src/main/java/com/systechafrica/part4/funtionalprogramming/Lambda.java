package com.systechafrica.part4.funtionalprogramming;

import java.time.LocalDate;
import java.time.Month;
import java.util.UUID;

public class Lambda {
    public static void main(String[] args) {
        LambdaFun funcFun = () -> UUID.randomUUID().toString();
        System.out.println(funcFun.generateRandomUUID());

        // ?Use the curly braces if the function contains more than one statement and
        // ?return type if the function should return a value

        LambdaFun funcFun2 = () -> {
            String generatedString = UUID.randomUUID().toString();
            System.out.println(generatedString);
            return generatedString.substring(5);

        };
        System.out.println(funcFun2.generateRandomUUID());

        GenerateReport report = (student) -> {
            System.out.println("****SYSTECH INTERNSHIP PROGRAMME REPORT***");
            System.out.println("   NAME: " + student.getName());
            System.out.println("   EMAIL: " + student.getEmail());
            System.out.println("   REG: " + student.getRegNo());
        };

        Student student = new Student(1, "Tony", "tony@gmail.com", "001");
        Student student2 = new Student(2, "manu", "mackrine@gmail.com", "002");
        report.generateReport(student);
        report.generateReport(student2);

        // * Lambda function that takes in more than one parameter and returns a value
        // * You have to use parenthesis if there is more than one parameter
        StudentCompare comparison = (studentOne, studentTwo) -> {
            System.out.println(studentOne.getName());
            System.out.println(studentTwo.getName());
            return studentOne.getName().equalsIgnoreCase(studentTwo.getName());
        };
        System.out.println(comparison.compare(student, student2));

        CompareFunction<Student, Student, Boolean> compareStudentsNOwUsingGenerics = (studentONe, studentTwo) -> {
            return studentONe.getName().equalsIgnoreCase(studentTwo.getName());
        };
        System.out.println(compareStudentsNOwUsingGenerics.compare(student, student2));

        CompareFunction<LocalDate, LocalDate, Boolean> comparisonTwo = (date1, date2) -> {
            return date1.isAfter(date2);
        };
        System.out.println(comparisonTwo.compare(LocalDate.now(), LocalDate.of(2023, Month.AUGUST, 20)));
    }
}
