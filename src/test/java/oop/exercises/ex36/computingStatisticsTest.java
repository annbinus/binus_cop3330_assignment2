package oop.exercises.ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class computingStatisticsTest {

    @Test
    void average_returns_right_value() {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("100");
        nums.add("200");
        nums.add("300");
        nums.add("1000");

        computingStatistics check = new computingStatistics();
        assertEquals(400.0, check.average(nums));
    }

    @Test
    void min_returns_right_value() {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("100");
        nums.add("200");
        nums.add("300");
        nums.add("1000");

        computingStatistics check = new computingStatistics();
        assertEquals(100.0, check.min(nums));
    }

    @Test
    void max_returns_right_value() {

        ArrayList<String> nums = new ArrayList<String>();
        nums.add("100");
        nums.add("200");
        nums.add("300");
        nums.add("1000");

        computingStatistics check = new computingStatistics();
        assertEquals(1000.0, check.max(nums));
    }

    @Test
    void std_returns_right_value() {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("100");
        nums.add("200");
        nums.add("300");
        nums.add("1000");

        computingStatistics check = new computingStatistics();
        assertEquals(353.55, check.std(nums));

    }
}