/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
*/

package oop.exercises.ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise33Test {

    @Test
    void selectRandom_returns_right_entry1() {

        Exercise33 check = new Exercise33();

        String expected = "Yes";
        String actual = check.selectRandom(1);

        assertEquals(expected, actual);
    }
    @Test
    void selectRandom_returns_right_entry2() {

        Exercise33 check = new Exercise33();

        String expected = "No";
        String actual = check.selectRandom(2);

        assertEquals(expected, actual);
    }
    @Test
    void selectRandom_returns_right_entry3() {

        Exercise33 check = new Exercise33();

        String expected = "Maybe";
        String actual = check.selectRandom(3);

        assertEquals(expected, actual);
    }

    @Test
    void selectRandom_returns_right_entry4() {

        Exercise33 check = new Exercise33();

        String expected = "Ask again later.";
        String actual = check.selectRandom(4);

        assertEquals(expected, actual);
    }

}
