package com.systechafrica.stringAndStringBuilder;

import java.util.logging.Logger;


public class StringBuilderDemo {
    private static final Logger LOGGER = Logger.getLogger(StringBuilderDemo.class.getName());

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(100); //capacity and not the number of characters
        sb.append(" ");
        String str = " ";

        boolean equals = str.equals(sb.toString()); // str == sb.toString(); comparing addresses -> false
        LOGGER.info(""+equals);

        
        


    }

}