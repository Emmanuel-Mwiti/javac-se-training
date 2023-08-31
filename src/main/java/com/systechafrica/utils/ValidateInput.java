package com.systechafrica.utils;



public class ValidateInput {

    public static final boolean validate(String input){
      if (input != null && input.length() > 0) {
        return true;
      }
        System.out.println("Input should not be empty!!");
        return false;
    }
    
}