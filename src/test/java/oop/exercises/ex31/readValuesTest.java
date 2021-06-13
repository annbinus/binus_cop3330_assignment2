package oop.exercises.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class readValuesTest {

    @Test
    void checkValue_returns_true_for_valid_values() {

        readValues check = new readValues();

        String expected = "1";
        String actual = check.checkValue("22");

        assertEquals(expected, actual);

    }

    @Test
    void checkValue_returns_false_for_null_values() {

        readValues check = new readValues();

        String expected = "Sorry. That's not a valid input.";
        String actual = check.checkValue("");

        assertEquals(expected, actual);

    }
    @Test
    void checkValue_returns_false_for_nonnumeric_values() {

        readValues check = new readValues();

        String expected = "Sorry. That's not a valid input.";
        String actual = check.checkValue("ABC");

        assertEquals(expected, actual);

    }

    @Test
    void checkValue_returns_false_for_zero_values() {

        readValues check = new readValues();

        String expected = "Sorry. That's not a valid input.";
        String actual = check.checkValue("0");

        assertEquals(expected, actual);

    }
}