package com.systechafrica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS) //? default instance 
public class AppTest {

    //? Reference => App
    App app = new App();

    @Test
    void add() {
        //when 
        int result = app.add(2, 3);
        //then
        int expected = 5;
        //verify that result = expected
        Assertions.assertEquals(expected, result, " the sum of 2 + 3 should be 5");

    }
    // @Test
    // void unHappy_path_add() {
    //     //when 
    //     int result = app.add(4, 6);
    //     //then
    //     int un_expected = 10;
    //     //verify that result = expected
    //     Assertions.assertNotEquals(app.add(2, 3), result, un_expected, "Tne sum should not be equal to 10");

    // }
    


}