package oop.exercises.ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus

* Exercise 34 - Employee List Removal
Sometimes you have to locate and remove an entry from a list based on some criteria. You may have a deck of cards and need to discard one so it’s no longer in play, or you may need to remove values from a list of valid inputs once they’ve been used. Storing the values in an array makes this process easier. Depending on your language, you may find it safer and more efficient to create a new array instead of modifying the existing one.
Create a small program that contains a list of employee names. Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining employees, each on its own line.

*  Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin
Enter an employee name to remove: Chris Jones
There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin

* Constraint
Use an array or list to store the names.

* Challenges
If the user enters a name that’s not found, print out an error message stating that the name does not exist.
Read in the list of employees from a file, with each employee on its own line.
Write the output to the same file you read in.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise34 {

    private static ArrayList<String> empList = new ArrayList<String>();

    private static Scanner scan = new Scanner(System.in);
    private static String name;

    public static void arrayInitializer(){
        empList.add("John Smith");
        empList.add("Jackie Jackson");
        empList.add("Chris Jones");
        empList.add("Amanda Cullen");
        empList.add("Jeremy Goodwin");
    }

    public static int index(String search){
        return empList.indexOf(search);
    }

    public static void readInput(){
        System.out.println("Enter an employee name to remove: ");
        name = scan.nextLine();
    }

    public static void printList(){

       System.out.print("There are only " + empList.size() + " employees:");
        for(String str : empList){
            System.out.println(str);
        }

    }
    public static int listSize(){
        return empList.size();
    }


    public static void main(String[] args) {

        arrayInitializer();
        printList();

        readInput();

        empList.remove(name);
        printList();
    }
}