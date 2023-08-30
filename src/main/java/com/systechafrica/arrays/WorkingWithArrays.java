package com.systechafrica.arrays;

import java.util.logging.Logger;

public class WorkingWithArrays {
    private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

    public void singleDimensionalArray() {
        int[] numbers = { 45, 10, 26, 35, 40, 59 };
        String[] nicknames = { "Mhusika", "Ntate", "Yokana" };
        for (int number : numbers) {
            LOGGER.info("" + number);
        }
        LOGGER.info(nicknames[0]);
        LOGGER.info(nicknames[1]);
        LOGGER.info(nicknames[2]);

    }

    public void multiDimensionalArray() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int [][] matrix2 = new int[3][]; //? Indicates a multidimensional array with length of three
        int [][] matrix3= new int[3][3]; //? Indicates a multidimensional array with length of three, and three individual elements
        String [][] matrix4 = new String[3][]; //?String arrray definition with length 3


         // To get the length we count the number of elements in the parent array
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
                ;
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        WorkingWithArrays app = new WorkingWithArrays();
        //app.singleDimensionalArray();
        app.multiDimensionalArray();



    }
}