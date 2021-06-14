/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
*/

package oop.exercises.ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLevelsTest {

    @Test
    void checkEntry_returns_true() {

        GameLevels check = new GameLevels();

        String expected = "1";
        String actual = check.checkEntry(3,3);

        assertEquals(expected, actual);
    }

    @Test
    void checkEntry_returns_false_when_too_low() {

        GameLevels check = new GameLevels();

        String expected = "Too low. Guess again: ";
        String actual = check.checkEntry(50,20);

        assertEquals(expected, actual);
    }

    @Test
    void checkEntry_returns_false_when_too_high() {

        GameLevels check = new GameLevels();

        String expected = "Too high. Guess again: ";
        String actual = check.checkEntry(50,100);

        assertEquals(expected, actual);
    }
}
