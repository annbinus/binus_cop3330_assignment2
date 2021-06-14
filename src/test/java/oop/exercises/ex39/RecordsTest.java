package oop.exercises.ex39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordsTest {

    @Test
    void sort_returns_right_name_at_given_index() {

        Records check = new Records();
            check.recordBase();
            String[] list = check.sort();
            assertEquals("Jackson", list[0]);
        }
}