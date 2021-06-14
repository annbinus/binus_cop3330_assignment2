/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
*/

package oop.exercises.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise29Test {
    

    @Test
    void check_r_returns_true_for_right_rvalue() {

        Exercise29 check = new Exercise29();

        String expected = "1";
        String actual = check.check_r("4");

        assertEquals(expected, actual);
    }

    @Test
    void check_r_returns_error_for_wrong_rvalue() {

        Exercise29 check = new Exercise29();

        String expected = "Sorry. That's not a valid input.";
        String actual = check.check_r("ABC");

        assertEquals(expected, actual);
    }

}
