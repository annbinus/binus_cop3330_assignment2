package oop.exercises.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise28Test {

    @Test
    void add_returns_15() {
        Exercise28 check = new Exercise28();

        double expected = 15;
        double actual = check.add(1,2,3,4,5);

        assertEquals(expected, actual);
    }

    @Test
    void add_returns_50() {
        Exercise28 check = new Exercise28();

        double expected = 50;
        double actual = check.add(10,10,10,10,10);

        assertEquals(expected, actual);
    }
}