package com.systechafrica.controlflow;


import java.util.logging.Logger;

public class ControlFlow {
    private static final Logger LOGGER = Logger.getLogger(ControlFlow.class.getName());

    public void ifelseStatement() {
        int maths = 23;
        char grade;

        if (maths >= 70) {
            grade = 'A';
             LOGGER.info("Student grade: "+grade);
        }
        // TODO: add conditions here to assign grade variable as expected
        // The Solution Here
        else if(maths>=60){
          grade = 'B';
          LOGGER.info("Student grade: "+grade); // + grade
        }
        else if(maths>=50){
          grade = 'C';
          LOGGER.info("Student grade: "+grade); // + grade
        }
        else if(maths>=40){
          grade = 'D';
          LOGGER.info("Student grade: "+grade); // + grade
        }
        else {
          grade='F';
          LOGGER.info("Student grade: "+grade);
        }
    }

    public void switchStatement() {
        String day = "Unknown";
        switch (day) {
            case "MONDAY":
                LOGGER.info("Monday working day");
                break;
            case "TUESDAY":
                LOGGER.info("Tuesday working day");
                break;
            case "WEDNESDAY":
                LOGGER.info("Wednesday  working day");
                break;
            case "THURSDAY":
                LOGGER.info("Thursday working day");
                break;
            case "FRIDAY":
                LOGGER.info("Friday working day");
                break;
            case "SATURDAY":
            case "SUNDAY":
                LOGGER.info("Sherehe");
                break;
            default:
                LOGGER.info("Please specify a valid day");

        }

    }

    public void While() {
        int studentCount = 0;
        int count = 0;
        while (studentCount < 10) {
            LOGGER.info("Sudent count is: " + studentCount);
            studentCount++;
            count++;
        }
    }
    
    public void doWhile() {
        int myNumber = 0;
        int count = 0;
        do {
            LOGGER.info("My number is"+myNumber);
            myNumber++;
            count++;
        }
        while (myNumber < 10);
    }
    public static void main(String[] args) {
        ControlFlow app = new ControlFlow();
       app.ifelseStatement();
        // app.switchStatement();

    }
}
