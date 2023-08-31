package com.systechafrica.variables;

public class SimpleClass {

    //! instance variable => can only be accessed after creating an object of the class
    public int age=10; 

     //! class variable -> can be accessed using ClassName followed by the variable name
    public static String  name = SimpleClass.class.getName();
}