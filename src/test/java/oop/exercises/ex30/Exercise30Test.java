package oop.exercises.ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise30Test {

    @Test
    void doMath_returns_right_value() {

        Exercise30 check = new Exercise30();

        int expected = 12;
        int actual = check.doMath(3,4);

        assertEquals(expected, actual);
    }


}