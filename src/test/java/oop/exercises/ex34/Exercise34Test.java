package oop.exercises.ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise34Test {
    @Test
    void listSize_returns_correct_size() {
        Exercise34 emp = new Exercise34();
        emp.arrayInitializer();
        assertEquals(5,emp.listSize());
    }

    @Test
    void index_returns_correct_index() {
        Exercise34 emp = new Exercise34();
        emp.arrayInitializer();
        assertEquals(1,emp.index("Jackie Jackson"));
    }
}