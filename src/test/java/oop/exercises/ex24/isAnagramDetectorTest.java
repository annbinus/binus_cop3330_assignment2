package oop.exercises.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isAnagramDetectorTest {

    @Test
    void isAnagram_return_true() {

        isAnagramDetector a = new isAnagramDetector();

        boolean expected = true;
        boolean actual = a.isAnagram("mile", "lime");

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_return_false(){
        isAnagramDetector a = new isAnagramDetector();

        boolean expected = false;
        boolean actual = a.isAnagram("mile", "lie");

        assertEquals(expected, actual);

    }
}