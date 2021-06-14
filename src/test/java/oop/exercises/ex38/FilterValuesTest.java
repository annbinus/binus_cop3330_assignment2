/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
*/

package oop.exercises.ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterValuesTest {

    @Test
    void convertList_returns_the_right_value() {

        List<String> list = new ArrayList<String>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        FilterValues check = new FilterValues();
        ArrayList<Integer> newList = check.convertList(list);
        assertEquals(1, newList.get(0));

    }

    @Test
    void evenNumbers_returns_the_right_value() {

        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        FilterValues check = new FilterValues();
        ArrayList<Integer> newList = check.convertList(list);
        check.evenNumbers(newList);
        assertEquals(2, newList.get(0));
    }
}
