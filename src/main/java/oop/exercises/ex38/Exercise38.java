package oop.exercises.ex38;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus

 * Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list containing only the even numbers.

* Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.

* Constraints
Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the old array and returns the new array.

* Challenge
Instead of prompting for numbers, read in lines from any text file and print out only the even-numbered lines.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise38 {

    private static final Scanner scan = new Scanner(System.in);

    public static List<String> enterValues(){

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String values = scan.nextLine();

        String[] list = values.split(" ");

        List<String> a1 = new ArrayList<>();
        a1 = Arrays.asList(list);

        return a1;
    }

    public static void printList(ArrayList<Integer> list){
        System.out.print("The even numbers are " + list.toString());
    }

    public static void main(String[] args) {

        FilterValues filter = new FilterValues();

        ArrayList<Integer> newList = filter.convertList(enterValues());

        newList = filter.evenNumbers(newList);

        printList(newList);

    }
}
