/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
*/

package oop.exercises.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkAllValidTest {

    @Test
    void validName_returns_false_for_null_name() {

        checkAllValid check = new checkAllValid();

        int expected = -1;
        int actual = check.validName("");

        assertEquals(expected, actual);
    }

    @Test
    void validName_returns_false_for_short_name() {

        checkAllValid check = new checkAllValid();

        int expected = 0;
        int actual = check.validName("f");

        assertEquals(expected, actual);
    }

    @Test
    void validName_returns_true_for_full_name() {

        checkAllValid check = new checkAllValid();

        int expected = 1;
        int actual = check.validName("John");

        assertEquals(expected, actual);
    }

    @Test
    void validID_returns_false_for_wrong_ID() {
        checkAllValid check = new checkAllValid();

        int expected = 0;
        int actual = check.validID("A787-3434");

        assertEquals(expected, actual);
    }

    @Test
    void validID_returns_true_for_right_ID() {
        checkAllValid check = new checkAllValid();

        int expected = 1;
        int actual = check.validID("AT-2313");

        assertEquals(expected, actual);
    }

    @Test
    void validZIP_returns_false_for_wrong_ZIP() {

        checkAllValid check = new checkAllValid();

        int expected = 0;
        int actual = check.validZIP("fe345");

        assertEquals(expected, actual);
    }

    @Test
    void validZIP_returns_true_for_right_ZIP() {

        checkAllValid check = new checkAllValid();

        int expected = 1;
        int actual = check.validZIP("57345");

        assertEquals(expected, actual);
    }

}
