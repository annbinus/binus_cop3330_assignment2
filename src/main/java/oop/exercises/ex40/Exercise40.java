package oop.exercises.ex40;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus

* Exercise 40 - Filtering Records
Sorting records is helpful, but sometimes you need to filter down the results to find or display only what you’re looking for.

Given the following data set create a program that lets a user locate all records that match the search string by comparing the search string to the first or last name field.

First Name	Last Name	Position	Separation Date
John	Johnson	Manager	2016-12-31
Tou	Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18


* Example Output
Enter a search string: Jac

Results:

Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |

* Constraint
Store the data using a list of maps.

* Challenges
Make the search case insensitive.
Add the option to search by position.
Add the option to find all employees where their separation date is six months ago or more.
Read in the data from a file.

 */

import java.util.Scanner;

public class Exercise40 {

    private static Scanner scan = new Scanner(System.in);

    public static String search() {
        System.out.print("Enter a search string: ");
        String search = scan.nextLine();

        if (search.equals(""))
        {
            System.out.println("No search string.");
        }
        else
            return search;
        return "";
    }

    public static void main(String[] args){

        FilteringRecords list = new FilteringRecords();
        list.recordbase();
        list.containsSearch(search());
        list.print();
    }
}
