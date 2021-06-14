/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
*/
package oop.exercises.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordCheckerTest {

    @Test
    void passwordValidator_returns_1() {

        passwordChecker check = new passwordChecker();
        int expected = 1;
        int actual = check.passwordValidator("12345");
        assertEquals(expected,actual);
    }

    @Test
    void passwordValidator_returns_2() {

        passwordChecker check = new passwordChecker();
        int expected = 2;
        int actual = check.passwordValidator("abcedef");
        assertEquals(expected,actual);
    }

    @Test
    void passwordValidator_returns_3() {

        passwordChecker check = new passwordChecker();
        int expected = 3;
        int actual = check.passwordValidator("abc123xyz");
        assertEquals(expected,actual);
    }

    @Test
    void passwordValidator_returns_4() {

        passwordChecker check = new passwordChecker();
        int expected = 4;
        int actual = check.passwordValidator("1337t@34gd");
        assertEquals(expected,actual);
    }

}
