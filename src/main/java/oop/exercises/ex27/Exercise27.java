package oop.exercises.ex27;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
* Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.
Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:
The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.
* Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
Or
Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.
* Constraints
Create a function for each type of validation you need to write. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.
* Challenges
Use regular expressions to validate the input.
Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
Repeat the process if the input is not valid.
 */
import java.util.Scanner;

public class Exercise27 {

    private static String fname;
    private static String lname;
    private static String ZIP;
    private static String ID;

    private static final Scanner scan = new Scanner(System.in);

    public static void readInput(){
        System.out.print("Enter the first name: ");
        fname = scan.nextLine();

        System.out.print("Enter the last name: ");
        lname = scan.nextLine();

        System.out.print("Enter the ZIP code: ");
        ZIP = scan.nextLine();

        System.out.print("Enter the employee ID: ");
        ID = scan.nextLine();
    }


    public static void main(String[] args) {

        readInput();
        checkAllValid valid = new checkAllValid();
        valid.validateInput(fname, lname, ZIP, ID);
    }
}